package me.zero.skyblock.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.zero.skyblock.main.SkyblockGame;

import java.util.HashSet;
import java.util.Set;

public class FlyCommand implements CommandExecutor {

	private SkyblockGame plugin;

    private final Set<Player> flyingPlayers = new HashSet<>();
	
	public FlyCommand(SkyblockGame plugin) {
		this.plugin = plugin;
   
    }
	
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only players can use this command!");
            return true;
        }

        Player player = (Player) sender;

        toggleFlight(player);
        return true;
    }

    private void toggleFlight(Player player) {
        if (flyingPlayers.contains(player)) {
            player.setAllowFlight(false);
            player.setFlying(false);
            flyingPlayers.remove(player);
            player.sendMessage(ChatColor.RED + "Flight mode has been disabled.");
        } else {
            player.setAllowFlight(true);
            player.setFlying(true);
            flyingPlayers.add(player);
            player.sendMessage(ChatColor.GREEN + "Flight mode has been enabled.");
        }
    }
}
