/*
 * issue: leaves broken in a forest strips every connected leaf at once, regardless of how far away they are
 * TODO: fix the massive number of leaves broken - figure out hoe getDistance works
 * 		
 * issue: config.yml file is not created
 * TODO: fix config file format and creation
 */






package com.daemonresolve.mc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.Tag;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.type.Leaves;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.LeavesDecayEvent;

public class FD_Listener implements Listener {
	private FastDecay fd;
	public long breakDelay = 7;
	public long decayDelay = 3;
	private  List<Block> schedule;
	private static List<BlockFace> neighbors = Arrays.asList(
			BlockFace.UP, BlockFace.NORTH, 
			BlockFace.EAST, BlockFace.SOUTH, 
			BlockFace.WEST, BlockFace.DOWN);
	
	// constructor
	public FD_Listener(FastDecay fastDecay) {
		fd = fastDecay;
		schedule = fd.schedule;
	}
	
	@EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
	public void onBlockBreak(BlockBreakEvent event) {
		/* on block break:
		 * check if block is a log or leaves
		 * if so, go to onBlockRemove, send block and delay params
		*/
		if (isValid(event.getBlock())) {
			onBlockRemove(event.getBlock(), breakDelay);
		}
		
	}
	
	@EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
	public void onLeavesDecay(LeavesDecayEvent event) {
		/* on leaf decay:
		 * check if block is a log or leaves
		 * if so, go to onBlockRemove, send block and delay params
		*/
		if (isValid(event.getBlock())) {
			onBlockRemove(event.getBlock(), decayDelay);
		}
		
	}
	
	void onBlockRemove(Block oldBlock, long delay) {
		/* onBlockRemove
		 * check if plugin is disabled, return if so
		 * check if the block is a log or leaf
		 * if valid, check the blocks on each face of the current block
		 * finally, sends all blocks in schedule to the decay function
		 * decay function should be caught by the listener and start the new onLeavesDecay
		*/
		if(!fd.isEnabled) {
			return;
		}
		
		// check if not logs or leaves
		if (!isValid(oldBlock)) {
            return;
        }
		
		// check all the blocks around (recursive function)
		checkFaces(oldBlock);
		for(Block block : schedule) {
			Bukkit.getServer().getScheduler().runTaskLater(fd, () -> decay(block), delay);
			}
		}
		
		
	private boolean decay(Block block) {
		if(!schedule.remove(block)) return false;
		if(!block.getWorld().isChunkLoaded(block.getX()>> 4, block.getZ() >> 4)) return false;
		if(!isLeaf(block)) return false;
		Leaves leaves = (Leaves) block.getBlockData();
		if (leaves.isPersistent()) return false;
		if (leaves.getDistance() > 7) return false;
		LeavesDecayEvent event = new LeavesDecayEvent(block);
		if (event.isCancelled()) return false;
		Particles(block);
		Sound(block);
		block.breakNaturally();
		return true;
	}
	
	private boolean isValid(Block block) {
		// checks if block is a leaf or a log
		if (Tag.LEAVES.isTagged(block.getType())) return true;
		if (Tag.LOGS.isTagged(block.getType())) return true;
		return false;
	}
	
	private boolean isLeaf(Block block) {
		if (Tag.LEAVES.isTagged(block.getType())) return true;
		return false;
	}
	
	
	private void checkFaces(Block block) {
		/* Check the faces of block to see if they are leaves
		 * send block to schedule and recursively check connected leaves
		 * 
		 */
		Collections.shuffle(neighbors);
		for (BlockFace face : neighbors) {
			Block newBlock = block.getRelative(face);
			if (isLeaf(newBlock)) {
				schedule.add(newBlock);
				if(CheckFacesReturnCondition(newBlock)) return;
				checkFaces(newBlock);
			}
		}
	}
	
	private boolean CheckFacesReturnCondition(Block newBlock) {
		// recursive return condition check -> all leaves connected to the current block are already scheduled
		boolean conditionMet = true; // assume true, if unscheduled leaves are found switch to false
		// check all 6 faces
		for (BlockFace face : neighbors) {
			Block test = newBlock.getRelative(face);
			if (!isLeaf(test)) continue;
			if (!schedule.contains(test)) conditionMet = false;;
		}
	return conditionMet;
	}
	
	private void Particles(Block block) {
		// do particles
		block.getWorld()
        .spawnParticle(Particle.BLOCK_DUST,
                       block.getLocation().add(0.5, 0.5, 0.5),
                       8, 0.2, 0.2, 0.2, 0,
                       block.getType().createBlockData());
	}
	
	private void Sound(Block block) {
		// do sound
		block.getWorld().playSound(block.getLocation(),
                Sound.BLOCK_GRASS_BREAK,
                SoundCategory.BLOCKS, 0.05f, 1.2f);
	}

}
