package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import me.zero.skyblock.main.SkyblockGame;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle.EnumTitleAction;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;
import me.zero.skyblock.main.SkyblockGame;

@CommandParameters(
description = "restart a server", 
usages = "§cUsage: /reboot",
rank = PlayerRank.ADMIN)
public class RebootCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
        player.sendMessage(ChatColor.GREEN + "Server reboot scheduled in 60 seconds.");

        new BukkitRunnable() {
            int countdown = 60;

            @Override
            public void run() {
                if (countdown == 0) {
                    Bukkit.broadcastMessage(ChatColor.RED + "§eServer is §cShutting down§e!");
                    Bukkit.shutdown();
                    cancel();
                    return;
                }

                if (countdown == 10 || countdown == 30 || countdown == 60) {
                    String title = "§c§lSERVER REBOOT!";
                    String subtitle = ChatColor.GREEN + "Game Update" + ChatColor.GRAY + " (in 0:" + countdown + ")";

                    for (Player player : Bukkit.getOnlinePlayers()) {
                        sendTitle(player, title, subtitle);
                    }

                    Bukkit.broadcastMessage(ChatColor.RED + "[Important]" + ChatColor.YELLOW + " This server will restart soon: " + ChatColor.AQUA + "Game Update");
                    Bukkit.broadcastMessage(ChatColor.YELLOW + "You have " + ChatColor.GREEN + countdown + " seconds " + ChatColor.YELLOW + "to warp out!");
                }

                countdown--;
            }
        }.runTaskTimer(SkyblockGame.getPlugin(SkyblockGame.class), 0L, 20L);

        return;
    }
    
    private void sendTitle(Player player, String title, String subtitle) {
        CraftPlayer craftPlayer = (CraftPlayer) player;
        IChatBaseComponent chatTitle = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + title + "\"}");
        IChatBaseComponent chatSubtitle = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + subtitle + "\"}");

        PacketPlayOutTitle titlePacket = new PacketPlayOutTitle(EnumTitleAction.TITLE, chatTitle);
        PacketPlayOutTitle subtitlePacket = new PacketPlayOutTitle(EnumTitleAction.SUBTITLE, chatSubtitle);

        craftPlayer.getHandle().playerConnection.sendPacket(titlePacket);
        craftPlayer.getHandle().playerConnection.sendPacket(subtitlePacket);
    }
}
