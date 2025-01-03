package me.zero.mortar.utils;

import lombok.SneakyThrows;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public final class MortarUtils {
    public static String color(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }
    @SneakyThrows
    private static void addChannel(Player player, String channel) {
        player.getClass().getMethod("addChannel", String.class).invoke(player, channel);
    }
}
