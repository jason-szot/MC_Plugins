package com.daemonresolve.mc.Generator.KitBuilders;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import com.daemonresolve.mc.Generator.CheckInventory;
import com.daemonresolve.mc.Generator.Enchanter;

import org.bukkit.ChatColor;

public class Kit_9 {
	// Kit 3: Diggers Kit
	// size value for check inventory
	private static int size = 2;
	
	public static void create(Player p, PlayerInventory pi) {
		// Check if there is enough inventory space
		if (CheckInventory.checkInventory(pi, size)) return;
		// Create enchanted shovel
				ItemStack Shovel = new ItemStack(Material.DIAMOND_SHOVEL,1);
				Shovel = Enchanter.maxEnchantShovel(Shovel);
				pi.addItem(Shovel);
				pi.addItem(Shovel);
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
	}
	
}
