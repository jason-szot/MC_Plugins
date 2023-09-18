package com.daemonresolve.mc;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class FastDecay extends JavaPlugin{
	public boolean isEnabled;
	public long breakDelay = 5;
	public long decayDelay = 2;
	public  List<Block> schedule = new ArrayList<>();
	
	public void onEnable() {
		getConfig().setDefaults(getConfig());
		Bukkit.getServer().getLogger().info("Fast Decay v" + this.getDescription().getVersion() + " enabled.");
		Bukkit.getServer().getPluginManager().registerEvents(new FD_Listener(this), this);
	}
	
	public void onDisable() {
		schedule.clear();
		Bukkit.getServer().getLogger().info("Fast Decay v" + this.getDescription().getVersion() + " disabled.");
	}
	
	
	// command handler
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("decay")) {
			if(args[0].equalsIgnoreCase("on")) {
				getConfig().set("enabled", "true");
				isEnabled = true;
				return true;
			}
			if(args[0].equalsIgnoreCase("off")) {
				getConfig().set("enabled", "false");
				isEnabled = false;
				return true;
			}
		}
		
		return true;
	}
}
