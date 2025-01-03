package me.zero.skyblock.ranks;

import me.zero.skyblock.user.User;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class SetRankCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player player = (Player) sender;
        User user = User.getUser(player);

        if (sender.isOp() || Objects.requireNonNull(user).rank == PlayerRank.ADMIN || Objects.requireNonNull(user).rank == PlayerRank.ADMIN) {
            if (args.length >= 2) {
                try {
                    Player target = Bukkit.getPlayer(args[0]);
                    PlayerRank newRank = PlayerRank.valueOf(args[1].toUpperCase().replace("+", "P"));
                    User.getUser(target).setRank(newRank);
                    String prefix = newRank == PlayerRank.DEFAULT ? "§7Default" : newRank.getPrefix().replace("[", "").replace("]", "");
                    sender.sendMessage("§aSet " + args[0] + "'s Rank To " + prefix + "§a!");
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                sender.sendMessage("§cUsage: /setrank <player> <rank>");
                return false;
            }
        } else {
            sender.sendMessage("§cYou need ADMIN rank to use this command.");
            return false;
        }
        return false;
    }
}