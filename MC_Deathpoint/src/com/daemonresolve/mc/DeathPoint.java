package com.daemonresolve.mc;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class DeathPoint extends JavaPlugin{
	
	
	public void onEnable(){
		Bukkit.getServer().getPluginManager().registerEvents(new DP_Listener(this), this);
		Bukkit.getServer().getLogger().info("DeathPoint v" + this.getDescription().getVersion() + " enabled.");
	}
	
	public void onDisable(){
		Bukkit.getServer().getLogger().info("DeathPoint v" + this.getDescription().getVersion() + " disabled.");
	}
	
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		String name = sender.getName();
		if(cmd.getName().equalsIgnoreCase("deathpoint")) {
			
			String loc = getConfig().getString("dp." + name + ".death" + ".world");
			World world = Bukkit.getWorld(loc);
			double x = getConfig().getDouble("dp." + name + ".death" + ".x");
			double y = getConfig().getDouble("dp." + name + ".death" + ".y");
			double z = getConfig().getDouble("dp." + name + ".death" + ".z");
			Location warpto = new Location(world, x, y, z);
			p.teleport(warpto);
			return true;
		}
		
		return false;
	}

	
	
}