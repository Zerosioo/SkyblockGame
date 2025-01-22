package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.plugin.Plugin;

import me.zero.skyblock.user.User;
import me.zero.skyblock.util.DiscordWebhook;
import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.main.SkyblockGame;
import me.zero.skyblock.ranks.PlayerRank;

import java.io.IOException;
import java.util.Objects;

@CommandParameters(
aliases = {"rank", "gift"},
description = "Rank a player", 
usages = "§cUsage: /setrank <player> <rank>",
requireOperator = true)
public class SetRankCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
        User user = User.getUser(player);

        if (args.length >= 2) {
                try {
                    Player target = Bukkit.getPlayer(args[0]);
                    PlayerRank newRank = PlayerRank.valueOf(args[1].toUpperCase().replace("+", "PLUS"));
                    User.getUser(target).setRank(newRank);
                    
                    String prefix = newRank == PlayerRank.DEFAULT ? "§7Default" : newRank.getPrefixColoured();
                    player.sendMessage("§aYou gifted " + args[0] + " the " + prefix + " §arank§a!");
                    
                    String pprefix = User.getUser(player).getRank().getPrefix() + player.getName();
                    
                    Bukkit.broadcastMessage("");
                    Bukkit.broadcastMessage("§e§kk§r§c§kk§4§kk§r " + pprefix + " §egifted the " + prefix + " §erank to " + newRank.getColour() + target.getName() + "§e! §4§kk§6§kk§e§kk");
                    Bukkit.broadcastMessage("§eThey have gifted §6" + user.getGiftedRanks() + " §eranks so far!");
                    Bukkit.broadcastMessage("");
                    sendNotification(player.getName(), target.getName(), prefix);
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                player.sendMessage("§cUsage: /rank <player> <rank>");
                return;
            }
    }
    
    private void sendNotification(String gifterName, String giftedToName, String rankName) {
        new BukkitRunnable(){

            public void run() {
                DiscordWebhook webhook = new DiscordWebhook("https://discord.com/api/webhooks/1313856846297301133/-1PndedywQJXe0UvLDVUKQjf-DqQIdpWXGoEHyV08A0kCcXUdSrpddrcTJSu6k_3wSeo");
                webhook.setUsername("RANK MANAGER");
                webhook.setAvatarUrl("https://media.discordapp.net/attachments/1311748865241907331/1322066977165934703/Red_Stained_Glass.png?ex=677b63d2&is=677a1252&hm=106462fe29fa98ad64fc9e6d46e1e4fc30f2b25b9c18baed4c683d068294d70b&");
                
           webhook.setContent("**" + gifterName + "** gifted the **" + rankName + "** rank to **" + giftedToName + "**.");
           
                try {
                    webhook.execute();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.runTaskAsynchronously((Plugin)SkyblockGame.getPlugin(SkyblockGame.class));
    }
}
