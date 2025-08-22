package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.items.build.SItem;
import me.zero.skyblock.ranks.PlayerRank;
import me.zero.skyblock.user.User;

@CommandParameters(
description = "Skyblock custom item command", 
usages = "§cUsage: /item <list|browse|item_id>",
rank = PlayerRank.ADMIN)
public class ItemCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
     if (args.length < 1) {
			player.sendMessage("§cUsage: /item <list|browse|item_id>");
			return;
		}
		
		if (args[0].equals("list") || args[0].equals("browse") || args[0].equals("b") || args[0].equals("l")) {
			player.sendMessage("§copening item list. (not implemented yet sry)");
			return;
		}
		
		SItem item = (SItem) SItem.getItemClass(args[0].toUpperCase());
		item.origin = "FROM_COMMAND_ACTOR_" + player.getName();
		
		if (item == null) {
			player.sendMessage("§cUnknown item!");
			player.sendMessage("§cPlease try again with a valid item_id.");
			player.sendMessage("§cIf you think there is an issue please contact zerosio.");
			return;
		}
		player.getInventory().addItem(item.buildItemStack(User.getUser(player.getUniqueId())));
    }
}
