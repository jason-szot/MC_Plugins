package com.daemonresolve.mc.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class BlockBreakListener implements Listener {

	@EventHandler (priority = EventPriority.LOWEST)
    public void onSpawnerBreak(org.bukkit.event.block.BlockBreakEvent e){
        //we need to figure out if they broke a spawner or not
        Block blockBroken = e.getBlock();
        if (blockBroken.getType().equals(Material.SPAWNER) && e.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
            e.setCancelled(true);
        	//Bukkit.getServer().getPluginManager().callEvent(new SpawnerBreakEvent(e.getPlayer(), blockBroken));
        }
    }

	
}
