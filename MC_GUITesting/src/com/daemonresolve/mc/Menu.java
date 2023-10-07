package com.daemonresolve.mc;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Menu extends JavaPlugin {

	public void onEnable(){
		Bukkit.getServer().getPluginManager().registerEvents(new MenuListener(), this);
		Bukkit.getServer().getLogger().info("Menus v" + this.getDescription().getVersion() + " enabled.");
	}
	
	public void onDisable(){
		Bukkit.getServer().getLogger().info("Menus v" + this.getDescription().getVersion() + " disabled.");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage(ChatColor.RED + "only players can get kits!");
			return true;
		}
		
		if (cmd.getName().equalsIgnoreCase("menu")) {
			MenuListener.openInventory((HumanEntity) sender);
		}
		
		return false;
	}
	
}
