package com.daemonresolve.mc.Generator.KitBuilders;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import com.daemonresolve.mc.Generator.CheckInventory;

import org.bukkit.ChatColor;

public class Kit_7 {
	// Kit 7: max enchanting setup kit (1 enchanting table, 15 bookshelves, 1 anvil)
	// size value for check inventory
	private static int size = 3;
	
	public static void create(Player p, PlayerInventory pi) {
		// Check if there is enough inventory space
		if (CheckInventory.checkInventory(pi, size)) return;
		pi.addItem(new ItemStack(Material.ENCHANTING_TABLE, 1));
		pi.addItem(new ItemStack(Material.BOOKSHELF, 15));
		pi.addItem(new ItemStack(Material.ANVIL, 1));
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
	}
	
}
