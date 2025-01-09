package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;
import me.zero.skyblock.user.User;

@CommandParameters(
description = "Manage skyblock xp", 
usages = "§cUsage: /skyblockxp <set|remove|add> <player> <amount>",
rank = PlayerRank.ADMIN)
public class SkyblockXPCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
        if (args.length < 3) {
            player.sendMessage(ChatColor.RED + "Usage: /skyblockxp <set|remove|add> <player> <amount>");
            return;
        }

        String action = args[0].toLowerCase();
        Player target = Bukkit.getPlayer(args[1]);
        if (target == null) {
            player.sendMessage(ChatColor.RED + "Player not found.");
            return;
        }

        User user = User.getUser(target);
        if (user == null) {
            player.sendMessage(ChatColor.RED + "User data not found for the specified player.");
            return;
        }

        try {
            int amount = Integer.parseInt(args[2]);
            switch (action) {
                case "set":
                    user.setSkyblockXP(amount);
                    player.sendMessage(ChatColor.GREEN + "Set " + target.getName() + "'s Skyblock XP to " + amount + ".");
                    break;

                case "remove":
                    user.setSkyblockXP(Math.max(0, user.getSkyblockXP() - amount));
                    player.sendMessage(ChatColor.GREEN + "Removed " + amount + " Skyblock XP from " + target.getName() + ".");
                    break;

                case "add":
                    user.addSkyblockXP(amount);
                    player.sendMessage(ChatColor.GREEN + "Added " + amount + " Skyblock XP to " + target.getName() + ".");
                    break;

                default:
                    player.sendMessage(ChatColor.RED + "Invalid action. Use set, remove, or add.");
                    break;
            }
            user.save(); // Ensure changes are persisted
        } catch (NumberFormatException e) {
            player.sendMessage(ChatColor.RED + "The amount must be a valid number.");
        }

        return;
    }
}
