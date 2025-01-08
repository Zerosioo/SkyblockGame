package me.zero.skyblock.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.zero.skyblock.ranks.PlayerRank;

public class TestCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage(ChatColor.BLUE + "[DEBUG]" + ChatColor.WHITE + " TEST MODE TURNED ON!");
        
        PlayerRank rank1 = PlayerRank.VIP;
        PlayerRank rank2 = PlayerRank.ADMIN;

        // Check if rank1 is below or equal to rank2
        if (rank1.isBelowOrEqual(rank2)) {
            sender.sendMessage(rank1 + " is below or equal to " + rank2);
        } else {
            sender.sendMessage(rank1 + " is not below or equal to " + rank2);
        }

        // Check if rank1 is above or equal to rank2
        if (rank1.isAboveOrEqual(rank2)) {
            sender.sendMessage(rank1 + " is above or equal to " + rank2);
        } else {
            sender.sendMessage(rank1 + " is not above or equal to " + rank2);
        }
    
        return true;
    }
}
