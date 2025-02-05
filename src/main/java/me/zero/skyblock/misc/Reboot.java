package me.zero.skyblock.misc;

import org.bukkit.entity.Player;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle.EnumTitleAction;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;
import me.zero.skyblock.Configuration;
import me.zero.skyblock.main.SkyblockGame;

public class Reboot {
	
	
	public void delayed() {
	// Start the reboot countdown after a delay of 2.5 hours
        new BukkitRunnable() {
            @Override
            public void run() {
                startRebootCountdown();
            }
        }.runTaskLater(SkyblockGame.getPlugin(SkyblockGame.class), 9000 * 20L); // 2.5 hours delay 
	
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
    private void startRebootCountdown() {
        new BukkitRunnable() {
            int countdown = 60;

            @Override
            public void run() {
                if (countdown == 0) {
                    Bukkit.broadcastMessage("§eServer is §cShutting down§e!");
                    Bukkit.shutdown();
                    cancel();
                    return;
                }

                if (countdown == 10 || countdown == 30 || countdown == 60) {
                    String title = "§c§lSERVER REBOOT!";
                    String subtitle = ChatColor.YELLOW + "Scheduled Reboot" + ChatColor.GRAY + " (in 0:" + countdown + ")";

                    for (Player player : Bukkit.getOnlinePlayers()) {
                        sendTitle(player, title, subtitle);
                    }

                    Bukkit.broadcastMessage(ChatColor.RED + "[Important]" + ChatColor.YELLOW + " This server will restart soon: " + ChatColor.AQUA + "Scheduled Reboot");
                    Bukkit.broadcastMessage(ChatColor.YELLOW + "You have " + ChatColor.GREEN + countdown + "s " + ChatColor.YELLOW + "to evacuate! Please reconnect to " + ChatColor.AQUA + Configuration.SERVER_DOMAIN);
                }

                countdown--;
            }
        }.runTaskTimer(SkyblockGame.getPlugin(SkyblockGame.class), 0L, 20L); // Countdown every second
    }
}
