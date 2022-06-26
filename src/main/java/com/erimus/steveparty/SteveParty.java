package com.erimus.steveparty;

import org.bukkit.plugin.java.JavaPlugin;

public final class SteveParty extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Steve Party PlugIn Activated!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Steve Party Plugin Deactivated!");
    }
}
