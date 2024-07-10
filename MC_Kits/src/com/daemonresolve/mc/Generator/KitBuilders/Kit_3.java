package com.daemonresolve.mc.Generator.KitBuilders;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import com.daemonresolve.mc.Generator.CheckInventory;

import org.bukkit.ChatColor;

public class Kit_3 {
	// Kit 3: Storage Kit
	// size value for check inventory
	private static int size = 11;
	
	public static void create(Player p, PlayerInventory pi) {
		// Check if there is enough inventory space
		if (CheckInventory.checkInventory(pi, size)) return;
		pi.addItem(new ItemStack(Material.CHEST, 64));
		pi.addItem(new ItemStack(Material.CHEST, 64));
		pi.addItem(new ItemStack(Material.CHEST, 64));
		pi.addItem(new ItemStack(Material.CHEST, 64));
		pi.addItem(new ItemStack(Material.HOPPER, 64));
		pi.addItem(new ItemStack(Material.HOPPER, 64));
		pi.addItem(new ItemStack(Material.HOPPER, 64));
		pi.addItem(new ItemStack(Material.HOPPER, 64));
		pi.addItem(new ItemStack(Material.REDSTONE_BLOCK, 64));
		pi.addItem(new ItemStack(Material.COMPARATOR, 64));
		pi.addItem(new ItemStack(Material.REPEATER, 64));
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
	}
	
}
