package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.items.build.Lists;
import me.zero.skyblock.items.build.SItem;
import me.zero.skyblock.ranks.PlayerRank;
import me.zero.skyblock.user.User;
import me.zero.skyblock.util.RandomObject;

@CommandParameters(
description = "Gives a random skyblock item", 
usages = "§cUsage: /giverandomitem",
rank = PlayerRank.ADMIN)
public class GiveRandomItemCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     { // THIS DOES NOT WORK AT THE MOMENT!
        ItemStack itemStack = SItem.getItemClass(RandomObject.getRandomFromList(Lists.items.keySet())).buildItemStack(User.getUser(player));
		player.sendMessage("§aYou got §f" + itemStack.getItemMeta().getDisplayName() + "§a!");
		player.getInventory().addItem(itemStack);
		
    }
}
