package com.daemonresolve.mc.listeners;

import org.bukkit.Material;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;

import com.daemonresolve.mc.events.SpawnerBreakEvent;

public class Listeners implements Listener{

	@EventHandler
    public void spawnerBreak(SpawnerBreakEvent e){

        //find the type of spawner
        CreatureSpawner cs = (CreatureSpawner) e.getSpawner().getState();

        //create a new spawner and set its entity type for the player to have
        ItemStack spawner_to_give = new ItemStack(Material.SPAWNER);
        BlockStateMeta meta = (BlockStateMeta) spawner_to_give.getItemMeta();
        CreatureSpawner css = (CreatureSpawner) meta.getBlockState();

        css.setSpawnedType(cs.getSpawnedType());
        meta.setBlockState(css);
        spawner_to_give.setItemMeta(meta);

        e.getBreaker().getInventory().addItem(spawner_to_give);
    }

	
}
