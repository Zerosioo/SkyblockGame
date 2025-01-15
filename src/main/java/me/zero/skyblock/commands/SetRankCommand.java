package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import me.zero.skyblock.user.User;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;

import java.util.Objects;

@CommandParameters(
aliases = {"rank", "gift"},
description = "Rank a player", 
usages = "§cUsage: /setrank <player> <rank>",
requireOperator = true)
public class SetRankCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
        User user = User.getUser(player);

        if (args.length >= 2) {
                try {
                    Player target = Bukkit.getPlayer(args[0]);
                    PlayerRank newRank = PlayerRank.valueOf(args[1].toUpperCase().replace("+", "PLUS"));
                    User.getUser(target).setRank(newRank);
                    
                    String prefix = newRank == PlayerRank.DEFAULT ? "§7Default" : newRank.getPrefixColoured();
                    player.sendMessage("§aYou gifted " + args[0] + " the " + prefix + " rank§a!");
                    
                    String pprefix = User.getUser(player).getRank().getPrefix() + player.getName();
                    
                    Bukkit.broadcastMessage("");
                    Bukkit.broadcastMessage("§e§kk§r§c§kk§4§kk§r " + pprefix + " §egifted the " + prefix + " §erank to " + newRank.getColour() + target.getName() + "§e! §4§kk§6§kk§e§kk");
                    Bukkit.broadcastMessage("§eThey have gifted §6" + user.getGiftedRanks() + " §eranks so far!");
                    Bukkit.broadcastMessage("");
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                player.sendMessage("§cUsage: /rank <player> <rank>");
                return;
            }
    }
}
