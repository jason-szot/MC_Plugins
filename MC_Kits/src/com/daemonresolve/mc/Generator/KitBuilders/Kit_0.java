package com.daemonresolve.mc.Generator.KitBuilders;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import com.daemonresolve.mc.Generator.CheckInventory;
import com.daemonresolve.mc.Generator.Enchanter;

import net.md_5.bungee.api.ChatColor;

public class Kit_0 {
	// Kit 0: mining kit (2 max enchanted diamond pickaxes,1 max enchanted diamond shovel, 3 stacks of torches)
	
	
	public static void create(Player p, PlayerInventory pi) {
		// Check if there is enough inventory space
		if (CheckInventory.checkInventory(pi, 6)) return;
		// Create enchanted pick
		ItemStack Pick = new ItemStack(Material.DIAMOND_PICKAXE,1);
		Pick = Enchanter.maxEnchantAxe(Pick);
		// Create enchanted shovel
		ItemStack Shovel = new ItemStack(Material.DIAMOND_SHOVEL,1);
		Shovel = Enchanter.maxEnchantShovel(Shovel);
		pi.addItem(Pick);
		pi.addItem(Pick);
		pi.addItem(Shovel);
		pi.addItem(new ItemStack(Material.TORCH, 64));
		pi.addItem(new ItemStack(Material.TORCH, 64));
		pi.addItem(new ItemStack(Material.TORCH, 64));
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
}
	
}
