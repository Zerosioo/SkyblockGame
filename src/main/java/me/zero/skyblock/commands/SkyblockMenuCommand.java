package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.inventory.inventories.skyblockmenu.SkyblockMenu;
import me.zero.skyblock.ranks.PlayerRank;

@CommandParameters(
description = "Opens skyblock menu", 
usages = "§cUsage: /skyblockmenu",
rank = PlayerRank.ADMIN)
public class SkyblockMenuCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
        new SkyblockMenu().open(player);
    }
}
