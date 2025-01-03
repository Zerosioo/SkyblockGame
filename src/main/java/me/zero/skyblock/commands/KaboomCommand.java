package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import me.zero.skyblock.main.SkyblockGame;

public class KaboomCommand implements CommandExecutor {

    private final SkyblockGame plugin;

    public KaboomCommand(SkyblockGame plugin) {
        this.plugin = plugin;
    }
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender.hasPermission("SkyblockGame.ADMIN"))) {
			sender.sendMessage("§cYou have to be an ADMIN to do this.");
			return true;
		}
		
		if (args.length == 0) {
			if (sender instanceof Player) {
				kaboomPlayer((Player) sender, sender);
			} else {
				sender.sendMessage("§eUsage: §b/kaboom <all|target>");
			}
			return true;
		}
		
		if (args[0].equalsIgnoreCase("all")) {
			kaboomAllPlayer(sender);
			return true;
		}
		
		Player targetPlayer = Bukkit.getPlayer(args[0]);
		
		if (targetPlayer == null || !targetPlayer.isOnline()) {
			sender.sendMessage("§cPlayer §b" + args[0] + " §cis not online!");
			return true;
		}
		
		kaboomPlayer(targetPlayer, sender);
		return true;
	}
	
	private void kaboomAllPlayer(CommandSender sender) {
		for (Player player : Bukkit.getOnlinePlayers()) {
			if (player != sender) {
				kaboomPlayer(player, sender);
				sendKaboomTitle(player, sender);
			}
		}
		sender.sendMessage("§cKaboomed all player!");
	}
	
	private void kaboomPlayer(Player target, CommandSender sender) {
		target.getWorld().strikeLightningEffect(target.getLocation());
		target.setVelocity(new Vector(0, 2, 0));
		target.sendMessage("§aYou was kaboomed.");
		
		sendKaboomTitle(target, sender);
	}
	
	private void sendKaboomTitle(Player player, CommandSender sender) {
		String titleMessage = "§c§lKABOOM!";
	}
}
