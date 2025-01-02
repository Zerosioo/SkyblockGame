package me.zero.skyblock.commands;

import me.zero.skyblock.main.SkyblockGame;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {
  
  private final SkyblockGame plugin;

    public Gamemode(SkyblockGame plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("SkyblockGame.ADMIN")) {
                if (args.length == 1) {
                    String mode = args[0].toLowerCase();

                    switch (mode) {
                        case "survival":
                        case "0":
                        case "s":
                            player.setGameMode(GameMode.SURVIVAL);
                            player.sendMessage(ChatColor.GREEN + "Your gamemode has been changed to Survival.");
                            break;
                        case "creative":
                        case "1":
                        case "c":
                            player.setGameMode(GameMode.CREATIVE);
                            player.sendMessage(ChatColor.GREEN + "Your gamemode has been changed to Creative.");
                            break;
                        case "adventure":
                        case "2":
                        case "a":
                            player.setGameMode(GameMode.ADVENTURE);
                            player.sendMessage(ChatColor.GREEN + "Your gamemode has been changed to Adventure.");
                            break;
                        case "spectator":
                        case "3":
                        case "sp":
                            player.setGameMode(GameMode.SPECTATOR);
                            player.sendMessage(ChatColor.GREEN + "Your gamemode has been changed to Spectator.");
                            break;
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "Usage: /gm <0|1|2|3>");
                }
            } else {
                sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            }
        } else {
            sender.sendMessage(ChatColor.RED + "You must be a player!");
        }
        return true;
    }
}