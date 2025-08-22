package me.zero.skyblock.farming.drop;

import org.bukkit.entity.Player;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TitleUtil {

    public static void sendTitle(Player player, String title, String subtitle, int fadeIn, int stay, int fadeOut) {
        try {
            Object handle = player.getClass().getMethod("getHandle").invoke(player);
            Object connection = handle.getClass().getField("playerConnection").get(handle);

            Class<?> packetPlayOutTitle = Class.forName("net.minecraft.server.v1_8_R3.PacketPlayOutTitle");
            Class<?> enumTitleAction = Class.forName("net.minecraft.server.v1_8_R3.PacketPlayOutTitle$EnumTitleAction");
            Class<?> iChatBaseComponent = Class.forName("net.minecraft.server.v1_8_R3.IChatBaseComponent");
            Class<?> chatSerializer = Class.forName("net.minecraft.server.v1_8_R3.IChatBaseComponent$ChatSerializer");

            Method a = chatSerializer.getMethod("a", String.class);
            Object titleComponent = a.invoke(null, "{\"text\":\"" + title + "\"}");
            Object subtitleComponent = a.invoke(null, "{\"text\":\"" + subtitle + "\"}");

            Constructor<?> titleConstructor = packetPlayOutTitle.getConstructor(enumTitleAction, iChatBaseComponent, int.class, int.class, int.class);
            Object packetTitle = titleConstructor.newInstance(
                    Enum.valueOf((Class<Enum>) enumTitleAction, "TITLE"), titleComponent, fadeIn, stay, fadeOut);
            Object packetSubtitle = titleConstructor.newInstance(
                    Enum.valueOf((Class<Enum>) enumTitleAction, "SUBTITLE"), subtitleComponent, fadeIn, stay, fadeOut);

            Method sendPacket = connection.getClass().getMethod("sendPacket", Class.forName("net.minecraft.server.v1_8_R3.Packet"));
            sendPacket.invoke(connection, packetTitle);
            sendPacket.invoke(connection, packetSubtitle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
