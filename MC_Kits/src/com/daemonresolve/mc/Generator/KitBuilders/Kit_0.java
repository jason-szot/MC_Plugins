package com.daemonresolve.mc.Generator.KitBuilders;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import com.daemonresolve.mc.Generator.CheckInventory;
import com.daemonresolve.mc.Generator.Enchanter;

import org.bukkit.ChatColor;

public class Kit_0 {
	// Kit 0: mining kit (2 max enchanted diamond pickaxes)
	// size value for check inventory
	private static int size = 2;
	
	
	public static void create(Player p, PlayerInventory pi) {
		// Check if there is enough inventory space
		if (CheckInventory.checkInventory(pi, size)) return;
		// Create enchanted pick
		ItemStack Pick = new ItemStack(Material.DIAMOND_PICKAXE,1);
		Pick = Enchanter.maxEnchantPickAxe(Pick);
		pi.addItem(Pick);
		pi.addItem(Pick);
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
}
	
}
