package me.zero.skyblock.commands;

import me.zero.skyblock.main.SkyblockGame;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BoopCommand implements CommandExecutor {
    private final SkyblockGame plugin;


    public BoopCommand(SkyblockGame plugin) {
        this.plugin = plugin;
      
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        if (args.length != 1) {
            sender.sendMessage(ChatColor.RED + "Usage: /boop <name>");
            return true;
        }

        String targetName = args[0];
        Player target = sender.getServer().getPlayer(targetName);

        if (target != null && target.isOnline()) {
            target.sendMessage(ChatColor.LIGHT_PURPLE + "Boop!");
            sender.sendMessage(ChatColor.GREEN + "Booped " + target.getName() + "!");
        } else {
            sender.sendMessage(ChatColor.RED + "Player " + targetName + " not found or offline.");
        }
        return true;
    }
}
