package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;
import me.zero.skyblock.main.SkyblockGame;

@CommandParameters(
description = "Hollows out the hub portal", 
usages = "§cUsage: /noportal",
rank = PlayerRank.ADMIN)
public class NoPortalCommand extends SkyBlockCommand {
	
	private final int[][] mainCoordinates = {
            {-4, -65}, {-3, -65}, {-2, -65},
            {-1, -64}, {-2, -64}, {-3, -64},
            {-4, -64}, {-5, -64}, {-1, -63},
            {-2, -63}, {-3, -63}, {-4, -63},
            {-5, -63}, {-1, -62}, {-2, -62},
            {-3, -62}, {-4, -62}, {-5, -62},
            {-4, -61}, {-3, -61}, {-2, -61}
    };

    
    private final int[][] surroundingCoordinates = {
            {0, -63}, {0, -64}, {0, -62},
            {-1, -65}, {-2, -66}, {-3, -66},
            {-4, -66}, {-5, -65}, {-6, -64},
            {-6, -63}, {-6, -62}, {-5, -61},
            {-4, -60}, {-3, -60}, {-2, -60}, {-1, -61}
    };

    @Override
    public void execute(Player player, String[] args)     {
        World world = player.getWorld();

        
        Bukkit.getScheduler().runTaskAsynchronously(SkyblockGame.getPlugin(SkyblockGame.class), () -> {
            
            for (int z = -61; z >= -65; z--) {
                
                final int currentZ = z;

                Bukkit.getScheduler().runTaskLater(SkyblockGame.getPlugin(SkyblockGame.class), () -> {
                    
                    for (int y = 70; y >= 54; y--) {
                        int currentY = y;

                        
                        for (int[] coord : mainCoordinates) {
                            if (coord[1] != currentZ) continue;

                            int x = coord[0];
                            Location loc = new Location(world, x, currentY, currentZ);
                            loc.getBlock().setType(Material.AIR);
                        }
                        
                        if (currentY < 70) { 
                            for (int[] coord : surroundingCoordinates) {
                                Location loc = new Location(world, coord[0], currentY, coord[1]);
                                Block block = loc.getBlock();
                                block.setType(Material.STONE);
                                block.setData((byte) 6); 
                            }
                        }
                    }
                }, 5L * (currentZ + 65)); 
            }
        });

        player.sendMessage("§cAyo Admon you doin sum fun stuff " + ChatColor.BLUE + "^⁠_⁠^");
        return;
    }
    
}
