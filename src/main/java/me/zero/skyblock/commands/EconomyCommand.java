package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;
import me.zero.skyblock.user.User;

@CommandParameters(
    description = "Modify user economy (coins or bits)",
    usages = "§cUsage: /economy <coins|bits> <add|remove|set|wipe> [amount] [player]",
    rank = PlayerRank.ADMIN
)
public class EconomyCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args) {
        if (args.length < 2) {
            player.sendMessage(ChatColor.RED + "Usage: /economy <coins|bits> <add|remove|set|wipe> [amount] [player]");
            return;
        }

        String currencyType = args[0].toLowerCase();
        String subCommand = args[1].toLowerCase();

        if (!currencyType.equals("coins") && !currencyType.equals("bits")) {
            player.sendMessage(ChatColor.RED + "Invalid economy type. Use: coins or bits.");
            return;
        }

        switch (subCommand) {
            case "add":
            case "remove":
            case "set":
                handleModify(player, args, currencyType, subCommand);
                break;
            case "wipe":
                handleWipe(player, args, currencyType);
                break;
            default:
                player.sendMessage(ChatColor.RED + "Invalid subcommand. Use: add, remove, set, or wipe.");
                break;
        }
    }

    private void handleModify(Player player, String[] args, String currencyType, String subCommand) {
        if (args.length < 3) {
            player.sendMessage(ChatColor.RED + "Usage: /economy " + currencyType + " " + subCommand + " <amount> [player]");
            return;
        }

        long amount;
        try {
            amount = Long.parseLong(args[2]);
        } catch (NumberFormatException e) {
            player.sendMessage(ChatColor.RED + "Invalid amount. Please enter a valid number.");
            return;
        }

        Player target = (args.length >= 4) ? Bukkit.getPlayer(args[3]) : player;

        if (target == null) {
            player.sendMessage(ChatColor.RED + "Player not found.");
            return;
        }

        User user = User.getUser(target.getUniqueId());
        if (user == null) {
            player.sendMessage(ChatColor.RED + "User data not found for the specified player.");
            return;
        }

        long newValue = 0;
        switch (subCommand) {
            case "add":
                newValue = (currencyType.equals("coins") ? user.getCoins() : user.getBits()) + amount;
                break;
            case "remove":
                newValue = Math.max(0, (currencyType.equals("coins") ? user.getCoins() : user.getBits()) - amount);
                break;
            case "set":
                newValue = amount;
                break;
        }

        if (currencyType.equals("coins")) {
            user.setCoins(newValue);
        } else {
            user.setBits(newValue);
        }

        user.save();
        player.sendMessage(ChatColor.GREEN + "Successfully " + subCommand + "ed " + amount + " " + currencyType +
                " for " + target.getName() + ". New balance: " + newValue);
    }

    private void handleWipe(Player player, String[] args, String currencyType) {
        Player target = (args.length >= 3) ? Bukkit.getPlayer(args[2]) : player;

        if (target == null) {
            player.sendMessage(ChatColor.RED + "Player not found.");
            return;
        }

        User user = User.getUser(target.getUniqueId());
        if (user == null) {
            player.sendMessage(ChatColor.RED + "User data not found for the specified player.");
            return;
        }

        if (currencyType.equals("coins")) {
            user.setCoins(0);
        } else {
            user.setBits(0);
        }

        user.save();
        player.sendMessage(ChatColor.GREEN + "Successfully wiped all " + currencyType + " for " + target.getName() + ".");
    }
}
