package com.daemonresolve.mc.Generator;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class Enchanter {

	public static ItemStack maxEnchantHelm(ItemStack helm) {
		helm = EnchantArmor(helm);
		helm.addEnchantment(Enchantment.RESPIRATION, 3);
		helm.addEnchantment(Enchantment.AQUA_AFFINITY, 1);
		return helm;
	}
	
	public static ItemStack maxEnchantBoots(ItemStack boots) {
		boots = EnchantArmor(boots);
		boots.addEnchantment(Enchantment.FEATHER_FALLING, 4);
		boots.addEnchantment(Enchantment.DEPTH_STRIDER, 3);
		boots.addEnchantment(Enchantment.SOUL_SPEED, 3);
		return boots;
	}
	
	public static ItemStack maxEnchantShirt(ItemStack shirt) {
		shirt = EnchantArmor(shirt);
		return shirt;
	}

	public static ItemStack maxEnchantPants(ItemStack pants) {
		pants = EnchantArmor(pants);
		pants.addEnchantment(Enchantment.SWIFT_SNEAK, 3);
		return pants;
	}
	
	public static ItemStack maxEnchantPickAxe(ItemStack pick) {
		pick = EnchantTools(pick);
		pick.addEnchantment(Enchantment.FORTUNE, 3);
		return pick;
	}
	
	public static ItemStack maxEnchantAxe(ItemStack axe) {
		axe = EnchantTools(axe);
		axe.addEnchantment(Enchantment.FORTUNE, 3);
		axe.addEnchantment(Enchantment.SHARPNESS, 5);
		return axe;
	}
	
	public static ItemStack maxEnchantShovel(ItemStack shovel) {
		shovel = EnchantTools(shovel);
		shovel.addEnchantment(Enchantment.FORTUNE, 3);
		return shovel;
	}
	
	public static ItemStack maxEnchantSword(ItemStack sword) {
		sword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
		sword.addEnchantment(Enchantment.LOOTING, 3);
		sword.addEnchantment(Enchantment.UNBREAKING, 3);
		sword.addEnchantment(Enchantment.SHARPNESS, 5);
		sword.addEnchantment(Enchantment.MENDING, 1);
		sword.addEnchantment(Enchantment.SWEEPING_EDGE, 3);
		return sword;
	}
	
	public static ItemStack maxEnchantShield(ItemStack shield) {
		shield.addEnchantment(Enchantment.UNBREAKING, 3);
		shield.addEnchantment(Enchantment.MENDING, 1);
		return shield;
	}
	
	private static ItemStack EnchantArmor(ItemStack armor) {
		armor.addEnchantment(Enchantment.PROTECTION, 4);
		armor.addEnchantment(Enchantment.UNBREAKING, 3);
		armor.addEnchantment(Enchantment.THORNS, 3);
		armor.addEnchantment(Enchantment.MENDING, 1);
		return armor;
	}
	
	private static ItemStack EnchantTools(ItemStack tool) {
		tool.addEnchantment(Enchantment.EFFICIENCY, 5);
		tool.addEnchantment(Enchantment.UNBREAKING, 3);
		tool.addEnchantment(Enchantment.MENDING, 1);
		return tool;
	}

	public static ItemStack SilkTouch(ItemStack st_tool) {
		st_tool = EnchantTools(st_tool);
		st_tool.addEnchantment(Enchantment.SILK_TOUCH, 1);
		return st_tool;
	}
}
