package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;
import me.zero.skyblock.user.User;

@CommandParameters(
aliases = {"msg"},
description = "Message a player", 
usages = "§cUsage: /msg <player> <message>",
rank = PlayerRank.DEFAULT)
public class MessageCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
        if (args.length < 2) {
            player.sendMessage(ChatColor.RED + "Usage: /msg <player> <message>");
            return;
        }

        // Get the target player
        Player target = Bukkit.getPlayer(args[0]);

        if (target == null || !target.isOnline()) {
            player.sendMessage(ChatColor.RED + "Player not found or is offline.");
            return;
        }

        // Build the message from the arguments
        StringBuilder messageBuilder = new StringBuilder();
        for (int i = 1; i < args.length; i++) {
            messageBuilder.append(args[i]).append(" ");
        }
        String message = messageBuilder.toString().trim();

        // Create the clickable message for the target player
        User tuser = User.getUser(target.getUniqueId());
        User puser = User.getUser(player.getUniqueId());
        
        TextComponent receivedMessage = new TextComponent(ChatColor.LIGHT_PURPLE + "From " + puser.getRank().getPrefix() + target.getName() + ChatColor.LIGHT_PURPLE + " to Me" + "§7: " + ChatColor.WHITE + message);
        receivedMessage.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/msg " + player.getName() + " "));
        receivedMessage.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§eClick to reply").create()));

        // Send the message to the target player
        target.spigot().sendMessage(receivedMessage);

        // Create the clickable message for the sender
        
        
        TextComponent sentMessage = new TextComponent(ChatColor.LIGHT_PURPLE + "From Me to " + tuser.getRank().getPrefix() + player.getName() + "§7: " + ChatColor.WHITE + message);
        sentMessage.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/msg " + target.getName() + " "));
        sentMessage.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§eClick to message").create()));

        // Send confirmation to the sender
        player.spigot().sendMessage(sentMessage);

        return;
    }
}
