package com.daemonresolve.mc.Generator;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import net.md_5.bungee.api.ChatColor;

public class KitGenerator {

	public static void give(int number, Player p, PlayerInventory pi) {
		switch (number) {
		case 0:
			kit_0(p, pi);
			break;
		case 1:
			kit_1(p, pi);
			break;
		case 2:
			kit_2(p, pi);
			break;
		case 3:
			kit_3(p, pi);
			break;
		case 4:
			kit_4(p, pi);
			break;
		case 5:
			kit_5(p, pi);
			break;
		case 6:
			kit_6(p, pi);
			break;
		case 7:
			kit_7(p, pi);
			break;
		}
		
	}
	
	/// Kit 0: mining kit (2 max enchanted diamond pickaxes,1 max enchanted diamond shovel, 3 stacks of torches)
	public static void kit_0(Player p, PlayerInventory pi){
		/// Check if there is enough inventory space
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
		return;
	}
	
	/// Kit 1: experience kit (1 stack of Lapis, 2 stacks of bottle of enchanting)
	public static void kit_1(Player p, PlayerInventory pi){
		/// Check if there is enough inventory space
		if (CheckInventory.checkInventory(pi, 3)) return;
		pi.addItem(new ItemStack(Material.LAPIS_LAZULI, 64));
		pi.addItem(new ItemStack(Material.EXPERIENCE_BOTTLE, 64));
		pi.addItem(new ItemStack(Material.EXPERIENCE_BOTTLE, 64));
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
		return;
	}
	
	// Kit 2: combat kit - max enchanted netherite armor, netherite sword, shield, 16 enchanted golden apples
	public static void kit_2(Player p, PlayerInventory pi) {
		/// Check if there is enough inventory space
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
		return;
	}
	
	/// Kit 3: Storage Kit
	public static void kit_3(Player p, PlayerInventory pi){
		/// Check if there is enough inventory space
		if (CheckInventory.checkInventory(pi, 10)) return;
		pi.addItem(new ItemStack(Material.CHEST, 64));
		pi.addItem(new ItemStack(Material.CHEST, 64));
		pi.addItem(new ItemStack(Material.CHEST, 64));
		pi.addItem(new ItemStack(Material.CHEST, 64));
		pi.addItem(new ItemStack(Material.HOPPER, 64));
		pi.addItem(new ItemStack(Material.HOPPER, 64));
		pi.addItem(new ItemStack(Material.HOPPER, 64));
		pi.addItem(new ItemStack(Material.REDSTONE_BLOCK, 64));
		pi.addItem(new ItemStack(Material.COMPARATOR, 64));
		pi.addItem(new ItemStack(Material.REPEATER, 64));
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
		return;
	}
	
	/// Kit 4: lumberjack kit (2 max enchanted diamond axes)
	public static void kit_4(Player p, PlayerInventory pi){
		/// Check if there is enough inventory space
		if (CheckInventory.checkInventory(pi, 2)) return;
		// Create enchanted pick
		ItemStack axe = new ItemStack(Material.DIAMOND_AXE,1);
		axe = Enchanter.maxEnchantAxe(axe);
		pi.addItem(axe);
		pi.addItem(axe);
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
		return;
	}
	
	/// Kit 5: silk touch kit (silk touch diamond pickaxe and shovel)
	public static void kit_5(Player p, PlayerInventory pi) {
		/// Check if there is enough inventory space
		if (CheckInventory.checkInventory(pi, 2)) return;
		ItemStack Pick = new ItemStack(Material.DIAMOND_PICKAXE,1);
		Pick = Enchanter.SilkTouch(Pick);
		// Create enchanted shovel
		ItemStack Shovel = new ItemStack(Material.DIAMOND_SHOVEL,1);
		Shovel = Enchanter.SilkTouch(Shovel);
		pi.addItem(Pick);
		pi.addItem(Shovel);
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
		return;
	}
	
	/// Kit 6: food kit (64 baked potatoes)
	public static void kit_6(Player p, PlayerInventory pi) {
		/// Check if there is enough inventory space
		if (CheckInventory.checkInventory(pi, 1)) return;
		pi.addItem(new ItemStack(Material.BAKED_POTATO, 64));
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
		return;
	}
	
	/// Kit 7: max enchanting setup kit (1 enchanting table, 15 bookshelves, 1 anvil)
	public static void kit_7(Player p, PlayerInventory pi) {
		/// Check if there is enough inventory space
		if (CheckInventory.checkInventory(pi, 3)) return;
		pi.addItem(new ItemStack(Material.ENCHANTING_TABLE, 1));
		pi.addItem(new ItemStack(Material.BOOKSHELF, 15));
		pi.addItem(new ItemStack(Material.ANVIL, 1));
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
		return;
	}
}
