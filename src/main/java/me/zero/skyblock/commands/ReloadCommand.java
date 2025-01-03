package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import me.zero.skyblock.main.SkyblockGame;

public class ReloadCommand implements CommandExecutor {

    private final SkyblockGame plugin;

    public ReloadCommand(SkyblockGame plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("SkyblockGame.ADMIN")) {
            sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            return true;
        }

        try {
            sender.sendMessage(ChatColor.YELLOW + "Reloading the plugin...");

            // Disable 
            Plugin pluginToReload = Bukkit.getPluginManager().getPlugin("SkyblockGame");
            if (pluginToReload != null) {
                Bukkit.getPluginManager().disablePlugin(pluginToReload);

                // Enable 
                Bukkit.getPluginManager().enablePlugin(pluginToReload);

                sender.sendMessage(ChatColor.GREEN + "Plugin reloaded successfully!");
            } else {
                sender.sendMessage(ChatColor.RED + "Plugin could not be found!");
            }
        } catch (Exception e) {
            sender.sendMessage(ChatColor.RED + "An error occurred while reloading the plugin. Check the console for details.");
            e.printStackTrace();
        }

        return true;
    }
}
