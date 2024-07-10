package com.daemonresolve.mc;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import com.daemonresolve.mc.Listeners.KitsListener;
import org.bukkit.ChatColor;

public class Kits extends JavaPlugin{

	public void onEnable(){
		Bukkit.getServer().getPluginManager().registerEvents(new KitsListener(), this);
		Bukkit.getServer().getLogger().info("kit v" + this.getDescription().getVersion() + " enabled.");
	}
	
	public void onDisable(){
		Bukkit.getServer().getLogger().info("kit v" + this.getDescription().getVersion() + " disabled.");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if (!(sender instanceof Player)){
			sender.sendMessage(ChatColor.RED + "only players can get kits!");
			return true;
		}
		Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("kit")){
			// open kits menu
			KitsListener.openInventory(p);
			return true;
		}
		return true;
	}
}