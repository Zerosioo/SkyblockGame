package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;

@CommandParameters(
     aliases = {"tpw"},
    description = "Toggle between worlds or list loaded world names",
    usages = "§cUsage: /tpworld <world_folder_name> [target] or /tpworld getnames",
    rank = PlayerRank.ADMIN
)
public class WorldTeleportCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args) {
        if (args.length < 1) {
            player.sendMessage(ChatColor.RED + "Usage: /tpworld <world_folder_name> [target] or /tpworld getnames");
            return;
        }

        String action = args[0];

        // Case for listing all loaded world folder names
        if (action.equalsIgnoreCase("getnames")) {
            StringBuilder worldList = new StringBuilder(ChatColor.GREEN + "Loaded worlds:\n");
            for (World world : Bukkit.getWorlds()) {
                worldList.append(ChatColor.YELLOW).append(world.getName()).append("\n");
            }
            player.sendMessage(worldList.toString());
            return;
        }

        // Case for teleporting to a world by folder name
        String folderName = action;
        World targetWorld = null;

        // Find the world by its folder name
        for (World world : Bukkit.getWorlds()) {
            if (world.getName().equalsIgnoreCase(folderName)) {
                targetWorld = world;
                break;
            }
        }

        if (targetWorld == null) {
            player.sendMessage(ChatColor.RED + "World folder " + folderName + " does not exist.");
            return;
        }

        Player targetPlayer;

        // If a target is provided, find the player. Otherwise, default to the command executor.
        if (args.length > 1) {
            targetPlayer = Bukkit.getPlayer(args[1]);
            if (targetPlayer == null) {
                player.sendMessage(ChatColor.RED + "Player " + args[1] + " is not online.");
                return;
            }
        } else {
            targetPlayer = player;
        }

        // Teleport the target player to the world
        targetPlayer.teleport(targetWorld.getSpawnLocation());
        targetPlayer.sendMessage(ChatColor.GREEN + "You have been teleported to the world with folder " + folderName + "!");
        if (!targetPlayer.equals(player)) {
            player.sendMessage(ChatColor.GREEN + "You teleported " + targetPlayer.getName() + " to the world with folder " + folderName + "!");
        }
    }
}
