package com.daemonresolve.mc.Generator;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class Enchanter {

	public static ItemStack SilkTouch(ItemStack item) {
		item.addEnchantment(Enchantment.SILK_TOUCH, 1);
		item.addEnchantment(Enchantment.DIG_SPEED, 5);
		item.addEnchantment(Enchantment.DURABILITY, 3);
		item.addEnchantment(Enchantment.MENDING, 1);
		return item;
	}
	
	public static ItemStack maxEnchantSword(ItemStack item) {
		item.addEnchantment(Enchantment.FIRE_ASPECT, 2);
		item.addEnchantment(Enchantment.LOOT_BONUS_MOBS, 3);
		item.addEnchantment(Enchantment.DURABILITY, 3);
		item.addEnchantment(Enchantment.DAMAGE_ALL, 5);
		item.addEnchantment(Enchantment.MENDING, 1);
		item.addEnchantment(Enchantment.SWEEPING_EDGE, 3);
		return item;
	}
	
	public static ItemStack maxEnchantHelm(ItemStack item) {
		item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		item.addEnchantment(Enchantment.DURABILITY, 3);
		item.addEnchantment(Enchantment.OXYGEN, 3);
		item.addEnchantment(Enchantment.WATER_WORKER, 1);
		item.addEnchantment(Enchantment.THORNS, 3);
		item.addEnchantment(Enchantment.MENDING, 1);
		return item;
	}
	
	public static ItemStack maxEnchantBoots(ItemStack item) {
		item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		item.addEnchantment(Enchantment.DURABILITY, 3);
		item.addEnchantment(Enchantment.PROTECTION_FALL, 4);
		item.addEnchantment(Enchantment.DEPTH_STRIDER, 3);
		item.addEnchantment(Enchantment.THORNS, 3);
		item.addEnchantment(Enchantment.SOUL_SPEED, 3);
		item.addEnchantment(Enchantment.MENDING, 1);
		return item;
	}
	
	public static ItemStack maxEnchantShirt(ItemStack item) {
		item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		item.addEnchantment(Enchantment.DURABILITY, 3);
		item.addEnchantment(Enchantment.THORNS, 3);
		item.addEnchantment(Enchantment.MENDING, 1);
		return item;
	}
	
	public static ItemStack maxEnchantPickAxe(ItemStack item) {
		item.addEnchantment(Enchantment.DIG_SPEED, 5);
		item.addEnchantment(Enchantment.DURABILITY, 3);
		item.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
		item.addEnchantment(Enchantment.MENDING, 1);
		return item;
	}
	
	public static ItemStack maxEnchantAxe(ItemStack item) {
		item.addEnchantment(Enchantment.DIG_SPEED, 5);
		item.addEnchantment(Enchantment.DURABILITY, 3);
		item.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
		item.addEnchantment(Enchantment.DAMAGE_ALL, 5);
		item.addEnchantment(Enchantment.MENDING, 1);
		return item;
	}
	
	public static ItemStack maxEnchantShovel(ItemStack item) {
		item.addEnchantment(Enchantment.DIG_SPEED, 5);
		item.addEnchantment(Enchantment.DURABILITY, 3);
		item.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
		item.addEnchantment(Enchantment.MENDING, 1);
		return item;
	}
	
	public static ItemStack maxEnchantPants(ItemStack item) {
		item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		item.addEnchantment(Enchantment.DURABILITY, 3);
		item.addEnchantment(Enchantment.THORNS, 3);
		item.addEnchantment(Enchantment.MENDING, 1);
		item.addEnchantment(Enchantment.SWIFT_SNEAK, 3);
		return item;
	}
	
	public static ItemStack maxEnchantShield(ItemStack item) {
		item.addEnchantment(Enchantment.DURABILITY, 3);
		item.addEnchantment(Enchantment.MENDING, 1);
		return item;
	}
	
}
