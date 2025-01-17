package me.zero.skyblock.util;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class SkyBlockLogger {

        private static final Logger LOGGER = Logger.getLogger("Minecraft");
    private static final String PREFIX = ChatColor.translateAlternateColorCodes('&', "&7[&bSkyblockGame&7] &f");

    private static void log(final Object message, final Level level) {
        LOGGER.log(level, PREFIX + message);
    }

    public static String getPrefix() {
        return PREFIX;
    }

    public static void sendMessage(String message) {
        Bukkit.getConsoleSender().sendMessage(PREFIX + ChatColor.translateAlternateColorCodes('&', message));
    }

    public static void info(final Object message) {
        int emoji = 0x1F5E3;
        sendMessage(ChatColor.GREEN  + message.toString());
    }

    public static void warn(final Object message) {
        log(ChatColor.YELLOW + "U+1F40A " + message.toString(), Level.WARNING);
    }

    public static void severe(final Object message)    {
        log(ChatColor.RED + "U+1F99C " + message.toString(), Level.SEVERE);
    }

}