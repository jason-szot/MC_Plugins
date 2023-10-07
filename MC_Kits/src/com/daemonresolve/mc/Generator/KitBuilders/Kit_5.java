package com.daemonresolve.mc.Generator.KitBuilders;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import com.daemonresolve.mc.Generator.CheckInventory;
import com.daemonresolve.mc.Generator.Enchanter;

import net.md_5.bungee.api.ChatColor;

public class Kit_5 {
	// Kit 5: silk touch kit (silk touch diamond pickaxe and shovel)
	
	public static void create(Player p, PlayerInventory pi) {
		// Check if there is enough inventory space
		if (CheckInventory.checkInventory(pi, 2)) return;
		ItemStack Pick = new ItemStack(Material.DIAMOND_PICKAXE,1);
		Pick = Enchanter.SilkTouch(Pick);
		// Create enchanted shovel
		ItemStack Shovel = new ItemStack(Material.DIAMOND_SHOVEL,1);
		Shovel = Enchanter.SilkTouch(Shovel);
		pi.addItem(Pick);
		pi.addItem(Shovel);
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
	}
	
}
