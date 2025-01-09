package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;
import me.zero.skyblock.user.User;

@CommandParameters(
description = "Modify user coins", 
usages = "§cUsage: /coins <view|add|remove|set> [player] [amount]",
rank = PlayerRank.ADMIN)
public class CoinsCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
       if (args.length < 1) {
            player.sendMessage(ChatColor.RED + "Usage: /coins <view|add|remove|set> [player] [amount]");
        }

        String subCommand = args[0].toLowerCase();

        switch (subCommand) {
            case "view":
                handleView(player, args);
                break;
            case "add":
            case "remove":
            case "set":
                handleModify(player, args, subCommand);
                break;
            default:
                player.sendMessage(ChatColor.RED + "Invalid subcommand. Use: view, add, remove, or set.");
                break;
        }
    }
    
    private void handleView(Player player, String[] args) {
        if (args.length == 1) {
            if (!(player instanceof Player)) {
                player.sendMessage(ChatColor.RED + "Only players can view their own coin balance.");
                return;
            }

            User user = User.getUser(player.getUniqueId());
            player.sendMessage(ChatColor.GREEN + "You have " + user.getCoins() + " coins.");
        } else {
            Player target = Bukkit.getPlayer(args[1]);
            if (target == null) {
                player.sendMessage(ChatColor.RED + "Player not found.");
                return;
            }

            User user = User.getUser(target.getUniqueId());
            player.sendMessage(ChatColor.GREEN + target.getName() + " has " + user.getCoins() + " coins.");
        }
    }

    private void handleModify(Player player, String[] args, String subCommand) {
        if (args.length < 3) {
            player.sendMessage(ChatColor.RED + "Usage: /coins " + subCommand + " <player> <amount>");
            return;
        }

        if (!player.hasPermission("coins.manage")) {
            player.sendMessage(ChatColor.RED + "You don't have permission to use this command.");
            return;
        }

        Player target = Bukkit.getPlayer(args[1]);
        if (target == null) {
            player.sendMessage(ChatColor.RED + "Player not found.");
            return;
        }

        User user = User.getUser(target.getUniqueId());
        long amount;

        try {
            amount = Long.parseLong(args[2]);
        } catch (NumberFormatException e) {
            player.sendMessage(ChatColor.RED + "Invalid amount. Please enter a valid number.");
            return;
        }

        switch (subCommand) {
            case "add":
                user.setCoins(user.getCoins() + amount);
                player.sendMessage(ChatColor.GREEN + "Added " + amount + " coins to " + target.getName() + ".");
                break;
            case "remove":
                user.setCoins(Math.max(0, user.getCoins() - amount));
                player.sendMessage(ChatColor.GREEN + "Removed " + amount + " coins from " + target.getName() + ".");
                break;
            case "set":
                user.setCoins(amount);
                player.sendMessage(ChatColor.GREEN + "Set " + target.getName() + "'s coins to " + amount + ".");
                break;
        }

        user.save();
    }
}
