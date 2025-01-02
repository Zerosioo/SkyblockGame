package me.zero.skyblock.listeners;

import me.zero.skyblock.ranks.PlayerRank;
import me.zero.skyblock.user.User;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChatListener extends PListener {
    @EventHandler(priority = EventPriority.LOW)
    public void Event(AsyncPlayerChatEvent e) {
        User data = User.getUser(e.getPlayer());
        e.setFormat("%1$s" + (data.rank == PlayerRank.DEFAULT ? ChatColor.GRAY : ChatColor.WHITE) + ": %2$s");
        e.getPlayer().setDisplayName(e.getPlayer().getName());
        
        Player player = e.getPlayer();
        User user = User.getUser(player.getUniqueId());
        user.load();

        // Initial rank and level prefix setup
        PlayerRank rank = user.rank;
        String colour = rank.getColour();
        String levelPrefix = user.LevelPrefix();

        String initialName = levelPrefix + " " + colour + player.getName();
        
        if (!e.getPlayer().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', initialName))) {
            e.getPlayer().setDisplayName(ChatColor.translateAlternateColorCodes('&', initialName));
        }
        if (rank.isAboveOrEqual(PlayerRank.MVP_PLUS_PLUS)) {
            e.setMessage(e.getMessage().replace("<3", "§c❤").replace("⭐", "§6✭").replace(":owo:", "§dO§5w§dO").replace("o/", "§d(/◕ヮ◕)/").replace(":OOF:", "§c§lOOF").replace(":123:", "§a1§e2§c3").replace(":shrug:", "§e¯\\(ツ)/¯").replace(":yes:", "§a✔").replace(":no:", "§c✖").replace(":java:", "§b♨").replace(":arrow:", "§e➡").replace(":typing:", "§e✎§6..."));
        }
    }
}