package com.daemonresolve.mc;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import net.md_5.bungee.api.ChatColor;

public class DP_Listener implements Listener{
	private DeathPoint dp;
	
	public DP_Listener(DeathPoint deathPoint) {
		dp = deathPoint;
	}

	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event) {
		Player p = event.getEntity();
		String name = p.getName();
		Double x = p.getLocation().getX();
		Double y = p.getLocation().getY();
		Double z = p.getLocation().getZ();
		
		dp.getConfig().set("dp." + name + ".death" + ".world", p.getLocation().getWorld().getName());
		dp.getConfig().set("dp." + name + ".death" + ".x", x);
		dp.getConfig().set("dp." + name + ".death" + ".y", y);
		dp.getConfig().set("dp." + name + ".death" + ".z", z);
		dp.saveConfig();
		
		p.sendMessage(ChatColor.GREEN + "DeathPoint is set");
	}
	
}
