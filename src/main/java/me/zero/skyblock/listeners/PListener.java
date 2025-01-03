package me.zero.skyblock.listeners;

import lombok.Getter;
import me.zero.skyblock.main.SkyblockGame;
import org.bukkit.event.Listener;

public class PListener implements Listener {
    @Getter
    private static int amount;
    protected SkyblockGame plugin;

    protected PListener() {
        this.plugin = SkyblockGame.getPlugin(SkyblockGame.class);
        this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
        ++amount;
    }

    static {
        amount = 0;
    }
}
