package com.daemonresolve.mc.Generator.KitBuilders;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import com.daemonresolve.mc.Generator.CheckInventory;
import com.daemonresolve.mc.Generator.Enchanter;

import net.md_5.bungee.api.ChatColor;

public class Kit_2 {
	// Kit 2: combat kit - max enchanted netherite armor, netherite sword, shield, 16 enchanted golden apples
	
	public static void create(Player p, PlayerInventory pi) {
		// Check if there is enough inventory space
		if (CheckInventory.checkInventory(pi, 7)) return;
		ItemStack helmet = new ItemStack(Material.NETHERITE_HELMET,1);
		ItemStack pants = new ItemStack(Material.NETHERITE_LEGGINGS,1);
		ItemStack boots = new ItemStack(Material.NETHERITE_BOOTS,1);
		ItemStack shirt = new ItemStack(Material.NETHERITE_CHESTPLATE,1);
		ItemStack sword = new ItemStack(Material.NETHERITE_SWORD,1);
		ItemStack shield = new ItemStack(Material.SHIELD, 1);
		ItemStack gapple = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 16);
		// enchant sword
		sword = Enchanter.maxEnchantSword(sword);
		// enchant helmet
		helmet = Enchanter.maxEnchantHelm(helmet);
		// enchant leggings
		pants = Enchanter.maxEnchantPants(pants);
		// enchant boots
		boots = Enchanter.maxEnchantBoots(boots);
		// enchant chest
		shirt = Enchanter.maxEnchantShirt(shirt);
		// enchant shield
		shield = Enchanter.maxEnchantShield(shield);
		// give items to player

		pi.addItem(sword);
		pi.addItem(helmet);
		pi.addItem(pants);
		pi.addItem(boots);
		pi.addItem(shirt);
		pi.addItem(shield);
		pi.addItem(gapple);

		p.sendMessage(ChatColor.GREEN + "You got your kit!");
	}
	
}
