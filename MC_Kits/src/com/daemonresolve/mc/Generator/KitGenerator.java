package com.daemonresolve.mc.Generator;

import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

import com.daemonresolve.mc.Generator.KitBuilders.*;

public class KitGenerator {

	public static void give(int number, Player p, PlayerInventory pi) {
		switch (number) {
		case 0:
			Kit_0.create(p, pi);
			break;
		case 1:
			Kit_1.create(p, pi);
			break;
		case 2:
			Kit_2.create(p, pi);
			break;
		case 3:
			Kit_3.create(p, pi);
			break;
		case 4:
			Kit_4.create(p, pi);
			break;
		case 5:
			Kit_5.create(p, pi);
			break;
		case 6:
			Kit_6.create(p, pi);
			break;
		case 7:
			Kit_7.create(p, pi);
			break;
		}
	}
}
