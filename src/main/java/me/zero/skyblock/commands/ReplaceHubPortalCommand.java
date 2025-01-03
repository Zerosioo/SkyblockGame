package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReplaceHubPortalCommand implements CommandExecutor {

    
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
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be run by a player.");
            return true;
        }

        Player player = (Player) sender;

        
        if (args.length != 1) {
            player.sendMessage("Usage: /replaceblocks <block>");
            return true;
        }

        
        Material blockType;
        try {
            blockType = Material.valueOf(args[0].toUpperCase());
        } catch (IllegalArgumentException e) {
            player.sendMessage("Invalid block type: " + args[0]);
            return true;
        }

        
        for (int[] coord : coordinates) {
            Location loc = new Location(player.getWorld(), coord[0], coord[1], coord[2]);
            loc.getBlock().setType(blockType);
        }

        player.sendMessage("Blocks replaced with " + blockType.name() + "!");
        return true;
    }
}
