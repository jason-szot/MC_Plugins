package com.daemonresolve.mc.Generator;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class CheckInventory {

	public static boolean checkInventory(PlayerInventory inventory, int count) {
		int i = 0;
		for ( ItemStack item : inventory) {
			if (item == null) i++;
			if (i == count) return false;
		}
		return true;
	}
	
}
