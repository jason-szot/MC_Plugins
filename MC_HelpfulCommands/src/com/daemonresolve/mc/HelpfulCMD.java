/*
 * collection of helpful commands
 */

package com.daemonresolve.mc;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class HelpfulCMD extends JavaPlugin{

	public void onEnable(){
		Bukkit.getServer().getLogger().info("Helpful Commands v" + this.getDescription().getVersion() + " enabled.");
	}
	
	public void onDisable(){
		Bukkit.getServer().getLogger().info("Helpful Commands v" + this.getDescription().getVersion() + " disabled.");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage(ChatColor.RED + "players only");
			return true;
		}
		
		Player p = (Player) sender;
		
		String command = cmd.getName();
		
		switch (command) {
			case "craft":
				return cmd_craft(p);
			case "ender":
				return cmd_ender(p);
			default:
				return false;
		}
	}

	private boolean cmd_ender(Player p) {
		// opens ender chest
		p.openInventory(p.getEnderChest());
		return true;
	}

	private boolean cmd_craft(Player p) {
		// opens crafting table
		p.openWorkbench(null, true);
		return false;
	}
	
}
