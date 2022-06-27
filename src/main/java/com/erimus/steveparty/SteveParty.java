package com.erimus.steveparty;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import com.erimus.steveparty.minigames.Minigame;

import java.util.ArrayList;

public final class SteveParty extends JavaPlugin {
    Minigame minigame;
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

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (label.equalsIgnoreCase("minigame")){
            String s = args[0];
            if (s.equalsIgnoreCase("load")){
                ArrayList<Player> L = new ArrayList<Player>(Bukkit.getOnlinePlayers());
                minigame = new Minigame();
                minigame.MinigameLoad(L);
            }
            else if (s.equalsIgnoreCase("start")){
                try{
                    minigame.MinigameStart();
                }catch (NullPointerException e){
                    p.sendMessage("Minigame is not loaded!");
                }
            }
            else if (s.equalsIgnoreCase("stop")){
                try{
                    minigame.MinigameStop();
                }catch (NullPointerException e){
                    p.sendMessage("Minigames is not Loaded!");
                }
            }
        }
        return true;
    }
}
