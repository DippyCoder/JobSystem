package com.dippycoder.jobSystem.listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BreakListener implements Listener {

    @EventHandler
    public static void OnBlockBreak(BlockBreakEvent e) {
        if(e.getBlock().getType() == Material.OAK_LOG) {
            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "eco give " + e.getPlayer().getName() + " 5");
        }else if(e.getBlock().getType() == Material.STONE) {
            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "eco give " + e.getPlayer().getName() + " 1");
        }
    }
}
