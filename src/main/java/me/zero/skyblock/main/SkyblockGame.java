package me.zero.skyblock.main;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

import lombok.Getter;
import me.zero.skyblock.user.Config;
import me.zero.skyblock.util.SkyBlockLogger;

public class SkyblockGame extends JavaPlugin {
    @Getter
    private static SkyblockGame plugin;
    private static SkyblockGame instance;
    public Config config;


    @Override
    public void onEnable() {
            
            
            plugin = this;
            instance = this;
            new Loader(this).load();

        // Launch message
        SkyBlockLogger.sendMessage("&a------------------------------------");
        SkyBlockLogger.sendMessage("&aSkyblockGame Core plugin has been enabled!");
        SkyBlockLogger.sendMessage("&aAuthor: Zero2Sixty2");
        SkyBlockLogger.sendMessage("&a------------------------------------");
    }

    @Override
    public void onDisable() {
        SkyBlockLogger.sendMessage("&c-------------------------------------");
        SkyBlockLogger.sendMessage("&cSkyblockGame Core plugin has been disabled!");
        SkyBlockLogger.sendMessage("&cAuthor: Zero2Sixty2");
        SkyBlockLogger.sendMessage("&c-------------------------------------");
        
        new Loader(this).deload();
    }

    public void loadConfig() {
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
    }

    public static SkyblockGame getInstance() {
        return instance;
    }
}