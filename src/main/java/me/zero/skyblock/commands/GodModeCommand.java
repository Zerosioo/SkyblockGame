package me.zero.skyblock.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Set;

public class GodModeCommand implements CommandExecutor {

    
    private static final Set<String> godModePlayers = new HashSet<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only players can use this command.");
            return true;
        }

        Player player = (Player) sender;

        if (godModePlayers.contains(player.getName())) {
            godModePlayers.remove(player.getName());
            player.sendMessage(ChatColor.RED + "God mode disabled.");
        } else {
            godModePlayers.add(player.getName());
            player.sendMessage(ChatColor.GREEN + "God mode enabled.");
        }

        return true;
    }

    
    public static boolean isGodModeEnabled(String playerName) {
        return godModePlayers.contains(playerName);
    }
}
