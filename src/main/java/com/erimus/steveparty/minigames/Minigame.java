package com.erimus.steveparty.minigames;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import java.util.ArrayList;

public class Minigame {
    public ArrayList<Player> PlayerList;

    public void MinigameLoad(ArrayList<Player> L){
        Bukkit.broadcastMessage("Minigame Loaded!");
        PlayerList = L;
    }

    public void PrintPlayers(){
        int n = PlayerList.size();
        Bukkit.broadcastMessage("The Players are....");
        for (int i = 0; i < n; ++i)
            Bukkit.broadcastMessage("" + i + ". " + PlayerList.get(i).getName());
    }

    public void MinigameStart(){
        Bukkit.broadcastMessage("Let me introduce Players!");
        PrintPlayers();
        Bukkit.broadcastMessage("Good Luck!");
        Bukkit.broadcastMessage("Game Start!");
    }
    public void MinigameStop(){
        Bukkit.broadcastMessage("Finish!");
    }
}