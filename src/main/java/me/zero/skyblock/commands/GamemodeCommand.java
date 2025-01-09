package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.GameMode;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;

@CommandParameters(
aliases = {"gm"},
description = "Toggle gamemode", 
usages = "§cUsage: /gamemode <0|1|2|3>",
rank = PlayerRank.ADMIN)
public class GamemodeCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
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
    }
}
