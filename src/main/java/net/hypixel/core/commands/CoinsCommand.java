package me.zero.skyblock.commands;

import me.zero.skyblock.user.User;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;

public class CoinsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length < 1) {
            sender.sendMessage(ChatColor.RED + "Usage: /coins <view|add|remove|set> [player] [amount]");
            return true;
        }

        String subCommand = args[0].toLowerCase();

        switch (subCommand) {
            case "view":
                handleView(sender, args);
                break;
            case "add":
            case "remove":
            case "set":
                handleModify(sender, args, subCommand);
                break;
            default:
                sender.sendMessage(ChatColor.RED + "Invalid subcommand. Use: view, add, remove, or set.");
                break;
        }

        return true;
    }

    private void handleView(CommandSender sender, String[] args) {
        if (args.length == 1) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.RED + "Only players can view their own coin balance.");
                return;
            }

            Player player = (Player) sender;
            User user = User.getUser(player.getUniqueId());
            sender.sendMessage(ChatColor.GREEN + "You have " + user.getCoins() + " coins.");
        } else {
            Player target = Bukkit.getPlayer(args[1]);
            if (target == null) {
                sender.sendMessage(ChatColor.RED + "Player not found.");
                return;
            }

            User user = User.getUser(target.getUniqueId());
            sender.sendMessage(ChatColor.GREEN + target.getName() + " has " + user.getCoins() + " coins.");
        }
    }

    private void handleModify(CommandSender sender, String[] args, String subCommand) {
        if (args.length < 3) {
            sender.sendMessage(ChatColor.RED + "Usage: /coins " + subCommand + " <player> <amount>");
            return;
        }

        if (!sender.hasPermission("coins.manage")) {
            sender.sendMessage(ChatColor.RED + "You don't have permission to use this command.");
            return;
        }

        Player target = Bukkit.getPlayer(args[1]);
        if (target == null) {
            sender.sendMessage(ChatColor.RED + "Player not found.");
            return;
        }

        User user = User.getUser(target.getUniqueId());
        long amount;

        try {
            amount = Long.parseLong(args[2]);
        } catch (NumberFormatException e) {
            sender.sendMessage(ChatColor.RED + "Invalid amount. Please enter a valid number.");
            return;
        }

        switch (subCommand) {
            case "add":
                user.setCoins(user.getCoins() + amount);
                sender.sendMessage(ChatColor.GREEN + "Added " + amount + " coins to " + target.getName() + ".");
                break;
            case "remove":
                user.setCoins(Math.max(0, user.getCoins() - amount));
                sender.sendMessage(ChatColor.GREEN + "Removed " + amount + " coins from " + target.getName() + ".");
                break;
            case "set":
                user.setCoins(amount);
                sender.sendMessage(ChatColor.GREEN + "Set " + target.getName() + "'s coins to " + amount + ".");
                break;
        }

        user.save();
    }
}
