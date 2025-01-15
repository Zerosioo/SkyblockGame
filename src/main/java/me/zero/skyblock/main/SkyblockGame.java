package me.zero.skyblock.main;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

import lombok.Getter;
import me.zero.skyblock.user.Config;

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
        getLogger().info(ChatColor.GREEN + "------------------------------------");
        getLogger().info(ChatColor.GREEN + "SkyblockGame Core plugin has been enabled!");
        getLogger().info(ChatColor.GREEN + "Author: Zero2Sixty2");
        getLogger().info(ChatColor.GREEN + "------------------------------------");
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.RED + "-------------------------------------");
        getLogger().info(ChatColor.RED + "SkyblockGame Core plugin has been disabled!");
        getLogger().info(ChatColor.RED + "Author: Zero2Sixty2");
        getLogger().info(ChatColor.RED + "-------------------------------------");
        
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