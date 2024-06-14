package com.daemonresolve.mc;

import java.util.Collection;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Chunk;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ChunkLoader extends JavaPlugin {

	
	public void onEnable(){
		Bukkit.getServer().getLogger().info("Chunk Loader v" + this.getDescription().getVersion() + " enabled.");
	}
	
	public void onDisable(){
		Bukkit.getServer().getLogger().info("Chunk Loader v" + this.getDescription().getVersion() + " disabled.");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage(ChatColor.RED + "players only");
			return true;
		}
		
		Player p = (Player) sender;
		
		String command = cmd.getName();
		
		if(command.equalsIgnoreCase("chunkloader")) {
			if (args.length == 0) {
				sender.sendMessage(ChatColor.RED + "Usage: /chunkloader on|off|status|list");
				return true;
			}
			
			switch(args[0]) {
			case "on":
				return chunk_loader(args[0], p);
			case "off":
				return chunk_loader(args[0], p);
			case "status":
				return chunk_loader(args[0], p);
			case "list":
				return chunk_loader(args[0], p);
			default:
				return true;
			
			}
				
			
		} else return true;
	}

	private boolean chunk_loader(String cmd, Player p) {
		// TODO Auto-generated method stub
		Chunk here = p.getLocation().getChunk();
		if(cmd.equalsIgnoreCase("on")) {
			here.setForceLoaded(true);
			p.sendMessage(ChatColor.RED + "Chunk is Force Loaded!");
			return here.isForceLoaded();
		}
		if(cmd.equalsIgnoreCase("off")) {
			here.setForceLoaded(false);
			p.sendMessage(ChatColor.RED + "Chunk is Not Force Loaded!");
			return here.isForceLoaded();
		}
		if(cmd.equalsIgnoreCase("status")) {
			if(here.isForceLoaded()) {
				p.sendMessage(ChatColor.RED + "Chunk Status is Force Loaded!");
			}else {
				p.sendMessage(ChatColor.RED + "Chunk Status is Not Force Loaded!");
			}
		}
		if(cmd.equalsIgnoreCase("list")) {
			Collection <Chunk> Chunk_List = p.getWorld().getForceLoadedChunks();
			if(Chunk_List.isEmpty()) {
				p.sendMessage(ChatColor.RED + "No Chunks Are Force Loaded!");
				return true;
			}
			for (Chunk I : Chunk_List) {
				p.sendMessage(ChatColor.GREEN + "Chunk X: " + I.getX() + ", Z: " + I.getZ() + " is Force Loaded.");
			}
		}
		
		
		
		return true;
	}
	
}
