package com.daemonresolve.mc;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;
import net.md_5.bungee.api.ChatColor;

public class Kits extends JavaPlugin{
	
	
	public void onEnable(){
		Bukkit.getServer().getLogger().info("kit v" + this.getDescription().getVersion() + " enabled.");
	}
	
	public void onDisable(){
		Bukkit.getServer().getLogger().info("kit v" + this.getDescription().getVersion() + " disabled.");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if (!(sender instanceof Player)){
			sender.sendMessage(ChatColor.RED + "only players can get kits!");
			return true;
		}
		
		Player p = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("kit")){
			// give the player some items
			// check for arguments
			if (args.length == 0){
				sender.sendMessage(ChatColor.RED + "No kit number named. Usage: /kit <kit number (1-5)>");
				return true;
			}
				PlayerInventory pi = p.getInventory();
				
				///kit functions
				int number = Integer.parseInt(args[0]);
				
				switch(number){
					case 1:
						kit_1(p, pi);
						return true;
					case 2:
						kit_2(p, pi);
						return true;
					case 3:
						kit_3(p, pi);
						return true;
					case 4:
						kit_4(p, pi);
						return true;
					case 5:
						kit_5(p, pi);
						return true;
					case 6:
						kit_6(p, pi);
						return true;
					case 7:
						kit_7(p, pi);
						return true;
					case 8:
						kit_8(p, pi);
						return true;
					default:
						p.sendMessage(ChatColor.RED + "Not a valid kit number");
						return true;
				}
			}
		
		if (cmd.getName().equalsIgnoreCase("listkits")) {
			sender.sendMessage(ChatColor.YELLOW + "Kit 1: Basic Mining");
			sender.sendMessage(ChatColor.YELLOW + "Kit 2: Basic Enchanting");
			sender.sendMessage(ChatColor.YELLOW + "Kit 3: Max Enchanting Setup");
			sender.sendMessage(ChatColor.YELLOW + "Kit 4: Advanced Mining");
			sender.sendMessage(ChatColor.YELLOW + "Kit 5: Basic Combat");
			sender.sendMessage(ChatColor.YELLOW + "Kit 6: Storage Kit");
			sender.sendMessage(ChatColor.YELLOW + "Kit 7: Lumberjack Kit");
			sender.sendMessage(ChatColor.YELLOW + "Kit 8: Advanced Combat Kit");
			return true;
		}
		
		
		return true;
	}

	/// Kit functions
	/// public void kit_<number>(Player p, PlayerInventory pi){
	/// 	pi.addItem(new ItemStack(Material.STONE_SWORD, 1));
	///		p.sendMessage(ChatColor.GREEN + "You got your kit!");
	///		return true;
	
	
	/// Kit 1: basic mining kit (2 diamond pickaxes, 3 stacks of torches)
	public void kit_1(Player p, PlayerInventory pi){
		pi.addItem(new ItemStack(Material.DIAMOND_PICKAXE, 1));
		pi.addItem(new ItemStack(Material.DIAMOND_PICKAXE, 1));
		pi.addItem(new ItemStack(Material.TORCH, 64));
		pi.addItem(new ItemStack(Material.TORCH, 64));
		pi.addItem(new ItemStack(Material.TORCH, 64));
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
		return;
	}
	
	/// Kit 2: basic enchanting kit (1 stack of Lapis, 2 stacks of bottle of enchanting)
	public void kit_2(Player p, PlayerInventory pi){
		pi.addItem(new ItemStack(Material.LAPIS_LAZULI, 64));
		pi.addItem(new ItemStack(Material.EXPERIENCE_BOTTLE, 64));
		pi.addItem(new ItemStack(Material.EXPERIENCE_BOTTLE, 64));
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
		return;
	}
	
	/// Kit 3: max enchanting setup kit (1 enchanting table, 15 bookshelves, 1 anvil)
	public void kit_3(Player p, PlayerInventory pi){
		pi.addItem(new ItemStack(Material.ENCHANTING_TABLE, 1));
		pi.addItem(new ItemStack(Material.BOOKSHELF, 15));
		pi.addItem(new ItemStack(Material.ANVIL, 1));
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
		return;
	}
		
	/// Kit 4: basic mining kit (2 max enchanted diamond pickaxes,1 enchanted diamond shovel, 3 stacks of torches)
	public void kit_4(Player p, PlayerInventory pi){
		// Create enchanted pick
		ItemStack Pick = new ItemStack(Material.DIAMOND_PICKAXE,1);
		Pick = maxEnchant(Pick, "pickaxe");
		// Create enchanted shovel
		ItemStack Shovel = new ItemStack(Material.DIAMOND_SHOVEL,1);
		Shovel = maxEnchant(Shovel, "shovel");
		pi.addItem(Pick);
		pi.addItem(Pick);
		pi.addItem(Shovel);
		pi.addItem(new ItemStack(Material.TORCH, 64));
		pi.addItem(new ItemStack(Material.TORCH, 64));
		pi.addItem(new ItemStack(Material.TORCH, 64));
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
		return;
	}
	
	/// Kit 5: basic combat kit (1 iron sword, full set of iron armor)
	public void kit_5(Player p, PlayerInventory pi){
		pi.addItem(new ItemStack(Material.IRON_SWORD, 1));
		pi.addItem(new ItemStack(Material.IRON_BOOTS, 1));
		pi.addItem(new ItemStack(Material.IRON_CHESTPLATE, 1));
		pi.addItem(new ItemStack(Material.IRON_HELMET, 1));
		pi.addItem(new ItemStack(Material.IRON_LEGGINGS, 1));
		p.sendMessage(ChatColor.GREEN + "You got your kit!");
		return;
	}
	
	/// Kit 6: Storage Kit
	public void kit_6(Player p, PlayerInventory pi){
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
	
	/// Kit 7: lumberjack kit (2 max enchanted diamond axes)
		public void kit_7(Player p, PlayerInventory pi){
			// Create enchanted pick
			ItemStack axe = new ItemStack(Material.DIAMOND_AXE,1);
			axe = maxEnchant(axe, "axe");
			pi.addItem(axe);
			pi.addItem(axe);
			p.sendMessage(ChatColor.GREEN + "You got your kit!");
			return;
		}
		
		// advanced combat kit - max enchanted netherite armor, netherite sword, shield, 16 enchanted golden apples
		public void kit_8(Player p, PlayerInventory pi) {
			ItemStack helmet = new ItemStack(Material.NETHERITE_HELMET,1);
			ItemStack pants = new ItemStack(Material.NETHERITE_LEGGINGS,1);
			ItemStack boots = new ItemStack(Material.NETHERITE_BOOTS,1);
			ItemStack shirt = new ItemStack(Material.NETHERITE_CHESTPLATE,1);
			ItemStack sword = new ItemStack(Material.NETHERITE_SWORD,1);
			ItemStack shield = new ItemStack(Material.SHIELD, 1);
			ItemStack gapple = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 16);
			// enchant sword
			sword = maxEnchant(sword, "sword");
			// enchant helmet
			helmet = maxEnchant(helmet, "helm");
			// enchant leggings
			pants = maxEnchant(pants, "pants");
			// enchant boots
			boots = maxEnchant(boots, "boots");
			// enchant chest
			shirt = maxEnchant(shirt, "shirt");
			// enchant shield
			shield = maxEnchant(shield, "shield");
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
		
		
		
		
		
		
		public ItemStack maxEnchant(ItemStack item, String type) {
			
			switch (type) {
				case "sword":
					item.addEnchantment(Enchantment.FIRE_ASPECT, 2);
					item.addEnchantment(Enchantment.LOOT_BONUS_MOBS, 3);
					item.addEnchantment(Enchantment.DURABILITY, 3);
					item.addEnchantment(Enchantment.DAMAGE_ALL, 5);
					item.addEnchantment(Enchantment.MENDING, 1);
					item.addEnchantment(Enchantment.SWEEPING_EDGE, 3);
					break;
				case "helm":
					item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
					item.addEnchantment(Enchantment.DURABILITY, 3);
					item.addEnchantment(Enchantment.OXYGEN, 3);
					item.addEnchantment(Enchantment.WATER_WORKER, 1);
					item.addEnchantment(Enchantment.THORNS, 3);
					item.addEnchantment(Enchantment.MENDING, 1);
					break;
				case "pants":
					item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
					item.addEnchantment(Enchantment.DURABILITY, 3);
					item.addEnchantment(Enchantment.THORNS, 3);
					item.addEnchantment(Enchantment.MENDING, 1);
					item.addEnchantment(Enchantment.SWIFT_SNEAK, 3);
					break;
				case "boots":
					item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
					item.addEnchantment(Enchantment.DURABILITY, 3);
					item.addEnchantment(Enchantment.PROTECTION_FALL, 4);
					item.addEnchantment(Enchantment.DEPTH_STRIDER, 3);
					item.addEnchantment(Enchantment.THORNS, 3);
					item.addEnchantment(Enchantment.SOUL_SPEED, 3);
					item.addEnchantment(Enchantment.MENDING, 1);
					break;
				case "shirt":
					item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
					item.addEnchantment(Enchantment.DURABILITY, 3);
					item.addEnchantment(Enchantment.THORNS, 3);
					item.addEnchantment(Enchantment.MENDING, 1);
					break;
				case "pickaxe":
					item.addEnchantment(Enchantment.DIG_SPEED, 5);
					item.addEnchantment(Enchantment.DURABILITY, 3);
					item.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
					item.addEnchantment(Enchantment.MENDING, 1);
					break;
				case "axe":
					item.addEnchantment(Enchantment.DIG_SPEED, 5);
					item.addEnchantment(Enchantment.DURABILITY, 3);
					item.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
					item.addEnchantment(Enchantment.DAMAGE_ALL, 5);
					item.addEnchantment(Enchantment.MENDING, 1);
					break;
				case "shovel":
					item.addEnchantment(Enchantment.DIG_SPEED, 5);
					item.addEnchantment(Enchantment.DURABILITY, 3);
					item.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
					item.addEnchantment(Enchantment.MENDING, 1);
					break;
				case "shield":
					item.addEnchantment(Enchantment.DURABILITY, 3);
					item.addEnchantment(Enchantment.MENDING, 1);
					break;
				case "silk_touch":
					item.addEnchantment(Enchantment.SILK_TOUCH, 1);
					break;
				default:
					break;
				
			}
			
			return item;
		}
}