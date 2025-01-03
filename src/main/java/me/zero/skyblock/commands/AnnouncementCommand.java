package me.zero.skyblock.commands;

import me.zero.skyblock.main.SkyblockGame;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AnnouncementCommand implements CommandExecutor {
	
    private final SkyblockGame plugin;

    public AnnouncementCommand(SkyblockGame plugin) {
        this.plugin = plugin;
    }

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player = (Player) sender;
		
		if (args.length < 1) {
			sender.sendMessage("§eUsage: §b/announce <message>");
			return true;
		}
		
		String message = String.join(" ", args);
		Bukkit.broadcastMessage("§c[ANNOUNCEMENT] §r" + message);
		return true;
	}
}

