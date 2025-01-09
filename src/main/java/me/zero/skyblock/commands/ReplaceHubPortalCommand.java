package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.Location;
import org.bukkit.Material;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;

@CommandParameters(
description = "Replace hub portal", 
usages = "§cUsage: /replacehubportal <block>",
rank = PlayerRank.ADMIN)
public class ReplaceHubPortalCommand extends SkyBlockCommand {
	
	private final int[][] coordinates = {
            {-4, 70, -65}, {-3, 70, -65}, {-2, 70, -65},
            {-1, 70, -64}, {-2, 70, -64}, {-3, 70, -64},
            {-4, 70, -64}, {-5, 70, -64}, {-1, 70, -63},
            {-2, 70, -63}, {-3, 70, -63}, {-4, 70, -63},
            {-5, 70, -63}, {-1, 70, -62}, {-2, 70, -62},
            {-3, 70, -62}, {-4, 70, -62}, {-5, 70, -62},
            {-4, 70, -61}, {-3, 70, -61}, {-2, 70, -61}
    };

    @Override
    public void execute(Player player, String[] args)     {
        if (args.length != 1) {
            player.sendMessage("Usage: /replacehubportal <block>");
            return;
        }

        
        Material blockType;
        try {
            blockType = Material.valueOf(args[0].toUpperCase());
        } catch (IllegalArgumentException e) {
            player.sendMessage("Invalid block type: " + args[0]);
            return;
        }

        
        for (int[] coord : coordinates) {
            Location loc = new Location(player.getWorld(), coord[0], coord[1], coord[2]);
            loc.getBlock().setType(blockType);
        }

        player.sendMessage("Blocks replaced with " + blockType.name() + "!");
        return;
    }
}
