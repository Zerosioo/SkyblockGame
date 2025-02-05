package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.zero.skyblock.Configuration;
import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;
import me.zero.skyblock.main.SkyblockGame;

@CommandParameters(
description = "Kick a player", 
usages = "§cUsage: /kick <name> <reason>",
rank = PlayerRank.ADMIN)
public class KickCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
        if (args.length >= 2) {
                                String reason = "";

                                for(int i = 1; i < args.length; ++i) {
                                        reason = reason + args[i] + " ";
                                }

                                Player target = Bukkit.getPlayerExact(args[0]);
                                if (target == null) {
                                        player.sendMessage("§cPlayer does not exist or offline.");
                                }

                                player.sendMessage("§aKicked player " + Bukkit.getPlayer(args[0]).getName() + " for " + reason);
                                target.kickPlayer("§cYou have been kicked!\n\n§7Reason: §f" + reason + "\n" + "§7Find out more: §b§n" + Configuration.KICK_DOMAIN);
                        } else {
                                player.sendMessage("§cInvalid syntax. Correct: /kick <name> <reason>");
         }
    }
}
