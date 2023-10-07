package com.daemonresolve.mc.Generator.KitBuilders;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import com.daemonresolve.mc.Generator.CheckInventory;

import net.md_5.bungee.api.ChatColor;

public class Kit_7 {
	// Kit 7: max enchanting setup kit (1 enchanting table, 15 bookshelves, 1 anvil)
	
	public static void create(Player p, PlayerInventory pi) {
		// Check if there is enough inventory space
		if (CheckInventory.checkInventory(pi, 3)) return;
		pi.addItem(new ItemStack(Material.ENCHANTING_TABLE, 1));
		pi.addItem(new ItemStack(Material.BOOKSHELF, 15));
		pi.addItem(new ItemStack(Material.ANVIL, 1));
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
	}
	
}
