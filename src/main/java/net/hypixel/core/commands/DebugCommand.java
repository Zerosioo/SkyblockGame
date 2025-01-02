package me.zero.skyblock.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.zero.skyblock.main.SkyblockGame;

public class DebugCommand implements CommandExecutor {

    private final SkyblockGame plugin;

    public DebugCommand(SkyblockGame plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.BLUE + "[DEBUG]" + ChatColor.WHITE + " Developer mode turned on");
        return true;
        // Haven't implemented the system yet
    }
}