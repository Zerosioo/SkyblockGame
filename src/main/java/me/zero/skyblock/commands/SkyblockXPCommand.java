package me.zero.skyblock.commands;

import me.zero.skyblock.user.User;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SkyblockXPCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only players can use this command.");
            return true;
        }

        if (!sender.hasPermission("skyblockxp.manage")) {
            sender.sendMessage(ChatColor.RED + "You don't have permission to use this command.");
            return true;
        }

        if (args.length < 3) {
            sender.sendMessage(ChatColor.RED + "Usage: /skyblockxp <set|remove|add> <player> <amount>");
            return true;
        }

        String action = args[0].toLowerCase();
        Player target = Bukkit.getPlayer(args[1]);
        if (target == null) {
            sender.sendMessage(ChatColor.RED + "Player not found.");
            return true;
        }

        User user = User.getUser(target);
        if (user == null) {
            sender.sendMessage(ChatColor.RED + "User data not found for the specified player.");
            return true;
        }

        try {
            int amount = Integer.parseInt(args[2]);
            switch (action) {
                case "set":
                    user.setSkyblockXP(amount);
                    sender.sendMessage(ChatColor.GREEN + "Set " + target.getName() + "'s Skyblock XP to " + amount + ".");
                    break;

                case "remove":
                    user.setSkyblockXP(Math.max(0, user.getSkyblockXP() - amount));
                    sender.sendMessage(ChatColor.GREEN + "Removed " + amount + " Skyblock XP from " + target.getName() + ".");
                    break;

                case "add":
                    user.addSkyblockXP(amount);
                    sender.sendMessage(ChatColor.GREEN + "Added " + amount + " Skyblock XP to " + target.getName() + ".");
                    break;

                default:
                    sender.sendMessage(ChatColor.RED + "Invalid action. Use set, remove, or add.");
                    break;
            }
            user.save(); // Ensure changes are persisted
        } catch (NumberFormatException e) {
            sender.sendMessage(ChatColor.RED + "The amount must be a valid number.");
        }

        return true;
    }
}
