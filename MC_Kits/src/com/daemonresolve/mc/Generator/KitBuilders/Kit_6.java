package com.daemonresolve.mc.Generator.KitBuilders;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import com.daemonresolve.mc.Generator.CheckInventory;

import org.bukkit.ChatColor;

public class Kit_6 {
	// Kit 6: food kit (64 baked potatoes)
	// size value for check inventory
	private static int size = 1;
	
	public static void create(Player p, PlayerInventory pi) {
		// Check if there is enough inventory space
		if (CheckInventory.checkInventory(pi, size)) return;
		pi.addItem(new ItemStack(Material.BAKED_POTATO, 64));
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
	}
	
}
