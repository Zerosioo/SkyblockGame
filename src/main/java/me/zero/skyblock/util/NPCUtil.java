package me.zero.skyblock.util;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class NPCUtil {

    public static void randomSpeak(Player player, String npcName, List<String> messages) {
        if (messages == null || messages.isEmpty())
            return;

        int randomIndex = ThreadLocalRandom.current().nextInt(messages.size());
        String selected = messages.get(randomIndex);

        player.sendMessage("§e[NPC] "+ npcName + ": §f" + selected);
        player.playSound(player.getLocation(), Sound.VILLAGER_YES, 10, 1.0f);
    }
}
