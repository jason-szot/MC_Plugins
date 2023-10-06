package com.daemonresolve.mc;

import org.bukkit.plugin.java.JavaPlugin;

import com.daemonresolve.mc.listeners.BlockBreakListener;
import com.daemonresolve.mc.listeners.Listeners;

public class SilkySpawner extends JavaPlugin {

    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
        getServer().getPluginManager().registerEvents(new Listeners(), this);
    }

	
}
