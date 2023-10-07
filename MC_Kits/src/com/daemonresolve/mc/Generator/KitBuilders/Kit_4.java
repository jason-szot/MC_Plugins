package com.daemonresolve.mc.Generator.KitBuilders;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import com.daemonresolve.mc.Generator.CheckInventory;
import com.daemonresolve.mc.Generator.Enchanter;

import net.md_5.bungee.api.ChatColor;

public class Kit_4 {
	// Kit 4: lumberjack kit (2 max enchanted diamond axes)
	
	public static void create(Player p, PlayerInventory pi) {
		// Check if there is enough inventory space
		if (CheckInventory.checkInventory(pi, 2)) return;
		// Create enchanted pick
		ItemStack axe = new ItemStack(Material.DIAMOND_AXE,1);
		axe = Enchanter.maxEnchantAxe(axe);
		pi.addItem(axe);
		pi.addItem(axe);
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
	}
	
}
