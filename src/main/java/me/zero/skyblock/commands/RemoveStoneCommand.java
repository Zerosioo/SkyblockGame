package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.main.SkyblockGame;
import me.zero.skyblock.ranks.PlayerRank;

@CommandParameters(
    description = "Removes all stone blocks in the player's current world",
    usages = "§cUsage: /removestone",
    rank = PlayerRank.ADMIN
)
public class RemoveStoneCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args) {
        World world = player.getWorld();

        player.sendMessage(ChatColor.YELLOW + "Removing all stone blocks in the world. This may take some time!");

        new BukkitRunnable() {
            @Override
            public void run() {
                int removedBlocks = 0;

                // Iterate through all loaded chunks in the world
                for (int cx = -100; cx <= 100; cx++) { // Adjust the chunk range as necessary
                    for (int cz = -100; cz <= 100; cz++) {
                        if (!world.isChunkLoaded(cx, cz)) {
                            continue;
                        }

                        for (int x = 0; x < 16; x++) {
                            for (int y = 0; y < 256; y++) {
                                for (int z = 0; z < 16; z++) {
                                    if (world.getBlockAt((cx << 4) + x, y, (cz << 4) + z).getType() == Material.STONE) {
                                        world.getBlockAt((cx << 4) + x, y, (cz << 4) + z).setType(Material.AIR);
                                        removedBlocks++;
                                    }
                                }
                            }
                        }
                    }
                }

                player.sendMessage(ChatColor.GREEN + "Finished removing all stone blocks! Total removed: " + removedBlocks);
            }
        }.runTaskAsynchronously(SkyblockGame.getPlugin(SkyblockGame.class));
    }
}
