package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import me.zero.skyblock.main.SkyblockGame; 

public class OpCommand implements CommandExecutor {

    private final SkyblockGame plugin;

    public OpCommand(SkyblockGame plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
      
        if (args.length != 1) {
            sender.sendMessage(ChatColor.RED + "Usage: /op <player>");
            return false;
        }
        
        if (!sender.hasPermission("SkyblockGame.OWNER")) {
            sender.sendMessage(ChatColor.RED + "You do not have permission to use this command.");
            return true;
        }

        Player target = Bukkit.getPlayer(args[0]);

        if (target == null) {
            sender.sendMessage(ChatColor.RED + "Player not found or is not online.");
            return true;
        }

        if (target.isOp()) {
            sender.sendMessage(ChatColor.YELLOW + target.getName() + " is already an operator.");
            return true;
        }

        target.setOp(true);

        target.sendMessage(ChatColor.GREEN + "You have been promoted to operator by " + sender.getName() + ".");
        sender.sendMessage(ChatColor.GREEN + "You have promoted " + target.getName() + " to operator.");

        return true;
    }

    public void execute(ConsoleCommandSender sender, String[] args) {
      
        if (args.length != 1) {
            sender.sendMessage(ChatColor.RED + "Usage: /op <player>");
            return;
        }

        Player target = Bukkit.getPlayer(args[0]);

        if (target == null) {
            sender.sendMessage(ChatColor.RED + "Player not found or is not online.");
            return;
        }

        if (target.isOp()) {
            sender.sendMessage(ChatColor.YELLOW + target.getName() + " is already an operator.");
            return;
        }

        target.setOp(true);
        target.sendMessage(ChatColor.GREEN + "You have been promoted to operator by console.");
        sender.sendMessage(ChatColor.GREEN + "You have promoted " + target.getName() + " to operator.");
    }
}
