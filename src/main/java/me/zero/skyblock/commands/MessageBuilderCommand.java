package me.zero.skyblock.commands;

import org.bukkit.entity.Player;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;
import me.zero.skyblock.user.User;

@CommandParameters(
aliases = {"mb"},
description = "Toggle message builder mode", 
usages = "§cUsage: /messagebuilder",
rank = PlayerRank.ADMIN)
public class MessageBuilderCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
        User user = User.getUser(player.getUniqueId());
        if (user.booleanHandler.getBoolean("messagebuilder") == false) {
        	
   	for (int i = 0; i < 100; i++) {
            player.sendMessage("");
       }
        	
        user.booleanHandler.setBoolean("messagebuilder", true); 
        
    } else if (user.booleanHandler.getBoolean("messagebuilder") == true) {
    	
    	user.booleanHandler.setBoolean("messagebuilder", false); 
    }
  }
}
