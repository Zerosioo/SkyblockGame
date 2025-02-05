package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.main.Cryptofication;
import me.zero.skyblock.ranks.PlayerRank;

@CommandParameters(
description = "Crypt and decrypt a message", 
usages = "§cUsage: /crypt <message>",
rank = PlayerRank.ADMIN)
public class CryptCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
        if (args.length < 1) {
			player.sendMessage("§cUsage: /crypt <message>");
		}
		
		String message = String.join(" ", args);
		String encrypted = Cryptofication.encrypt(message);
		String decrypted = Cryptofication.decrypt(encrypted);
		player.sendMessage("");
		player.sendMessage("§c[CRYPTOFICATOR]");
		player.sendMessage("§eOriginal message = §b" + message);
		player.sendMessage("§cEncrypted = §b" + encrypted);
		player.sendMessage("§cDecrypted = §b" + decrypted);
		player.sendMessage("");
    }
}
