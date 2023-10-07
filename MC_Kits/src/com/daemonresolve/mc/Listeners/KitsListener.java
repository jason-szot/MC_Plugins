package com.daemonresolve.mc.Listeners;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import com.daemonresolve.mc.Generator.KitGenerator;

public class KitsListener implements Listener {

	private static Inventory KitMenu;
	
	public KitsListener() {
		KitMenu = Bukkit.createInventory(null, 9, ChatColor.GOLD + "Get Your Kits");
		initializeMenu();
	}

	private void initializeMenu() {
		KitMenu.addItem(createGuiItem(Material.DIAMOND_PICKAXE, "§bMining Kit", "§a2 Enchanted Diamond Pickaxes", "§b1 Enchanted Diamond Shovel", "§c3 Stacks of Torches"));
		KitMenu.addItem(createGuiItem(Material.EXPERIENCE_BOTTLE, "§bExperience Kit", "§a2 Stacks of Experience Bottles", "§b1 Stack of Lapis Lazuli"));
		KitMenu.addItem(createGuiItem(Material.DIAMOND_SWORD, "§bCombat Kit", "§aFull Set of Enchanted Netherite Armor", "§bEnchanted Diamond Sword", "§cEnchanted Shield", "§d16 Enchanted Golden Apples"));
		KitMenu.addItem(createGuiItem(Material.CHEST, "§bAuto-Sorting Storage Kit", "§aChests, Hoppers, Redstone"));
		KitMenu.addItem(createGuiItem(Material.DIAMOND_AXE, "§bLumberjack Kit", "§a2 Enchanted Diamond Axes"));
		KitMenu.addItem(createGuiItem(Material.COBWEB, "§bSilk Touch Kit", "§aEnchanted Diamond Pickaxe", "§bEnchanted Diamond Shovel"));
		KitMenu.addItem(createGuiItem(Material.BAKED_POTATO, "§bFood Kit", "§a64 Baked Potatoes"));
		KitMenu.addItem(createGuiItem(Material.ENCHANTING_TABLE, "§bEnchanting Table Kit", "§aEnchanting Table", "§b15 Bookshelves", "§b1 Anvil"));
	}
	
	private ItemStack createGuiItem(final Material material, final String name, final String... lore) {

		final ItemStack item = new ItemStack(material, 1);
		final ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(name);
		meta.setLore(Arrays.asList(lore));
		item.setItemMeta(meta);
		return item;
	}
	
	@EventHandler
    public void onInventoryClick(final InventoryClickEvent e) {
        if (!e.getInventory().equals(KitMenu)) return;
        e.setCancelled(true);
        final ItemStack clickedItem = e.getCurrentItem();
        // verify current item is not null
        if (clickedItem == null || clickedItem.getType().isAir()) return;
        final Player p = (Player) e.getWhoClicked();
        PlayerInventory pi = p.getInventory();
        KitGenerator.give(e.getRawSlot(), p, pi);
    }
	
	@EventHandler
    public void onInventoryClick(final InventoryDragEvent e) {
        if (e.getInventory().equals(KitMenu)) {
          e.setCancelled(true);
        }
    }
	
	public static void openInventory(final HumanEntity ent) {
		ent.openInventory(KitMenu);
	}
}
