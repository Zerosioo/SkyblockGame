package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;

@CommandParameters(
description = "Op a player", 
usages = "§cUsage: /op <player>",
rank = PlayerRank.COOWNER)
public class OpCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
        if (args.length != 1) {
            player.sendMessage(ChatColor.RED + "Usage: /op <player>");
            return;
        }
        
        Player target = Bukkit.getPlayer(args[0]);

        if (target == null) {
            player.sendMessage(ChatColor.RED + "Player not found or is not online.");
            return;
        }

        if (target.isOp()) {
            player.sendMessage(ChatColor.YELLOW + target.getName() + " is already an operator.");
            return;
        }

        target.setOp(true);

        target.sendMessage(ChatColor.GREEN + "You have been promoted to operator by " + player.getName() + ".");
        player.sendMessage(ChatColor.GREEN + "You have promoted " + target.getName() + " to operator.");

        return;
    }
    
}
