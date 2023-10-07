package com.daemonresolve.mc.Generator.KitBuilders;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import com.daemonresolve.mc.Generator.CheckInventory;

import net.md_5.bungee.api.ChatColor;

public class Kit_1 {
	// Kit 1: experience kit (1 stack of Lapis, 2 stacks of bottle of enchanting)
	
	public static void create(Player p, PlayerInventory pi) {
		// Check if there is enough inventory space
		if (CheckInventory.checkInventory(pi, 3)) return;
		pi.addItem(new ItemStack(Material.LAPIS_LAZULI, 64));
		pi.addItem(new ItemStack(Material.EXPERIENCE_BOTTLE, 64));
		pi.addItem(new ItemStack(Material.EXPERIENCE_BOTTLE, 64));
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
	}
	
}
