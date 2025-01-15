package me.zero.skyblock.commands;

import org.bukkit.entity.Player;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;
import me.zero.skyblock.user.User;

@CommandParameters(
description = "Toggle dev mode", 
usages = "§cUsage: /debug",
rank = PlayerRank.ADMIN)
public class DebugCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
        User user = User.getUser(player.getUniqueId());
        if (user.booleanHandler.getBoolean("debug") == false) {
        player.sendMessage("§9[DEBUG] §fDeveloper mode turned on!");
        user.booleanHandler.setBoolean("debug", true); 
    } else if (user.booleanHandler.getBoolean("debug") == true) {
    	
    	player.sendMessage("§9[DEBUG] §fDeveloper mode turned off!");
    	user.booleanHandler.setBoolean("debug", false); 
    }
  }
}
