package me.zero.skyblock.main;

import me.zero.skyblock.commands.*;
import me.zero.skyblock.commands.abstraction.SkyBlockCommand;
import me.zero.skyblock.listeners.*;
import me.zero.skyblock.location.LocationListener;
import me.zero.skyblock.location.LocationManager;
import me.zero.skyblock.ranks.*;
import me.zero.mortar.MortarLibrary;
import me.zero.mortar.npc.*;
import me.zero.skyblock.npcs.hub.*;
import me.zero.skyblock.npcs.hub.museum.*;
import me.zero.skyblock.npcs.removed.*;
import me.zero.skyblock.npcs.park.*;
import me.zero.skyblock.npcs.end.*;
import me.zero.skyblock.npcs.custom.*;
import me.zero.skyblock.user.*;
import me.zero.skyblock.util.*;
import org.bukkit.plugin.java.JavaPlugin;
import org.reflections.Reflections;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.event.Listener;
import org.bukkit.command.Command;
import org.bukkit.command.CommandMap;
import org.bukkit.command.SimpleCommandMap;

import lombok.Getter;
import org.reflections.Reflections;
import java.lang.reflect.InvocationTargetException;

import java.util.List;
import java.util.Map;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

public class SkyblockGame extends JavaPlugin {
    @Getter
    private static SkyblockGame plugin;
    private static SkyblockGame instance;
    public Config config;

    @Getter
    private static NPCRegistry npcRegistry;
     @Getter
    private static MortarLibrary mortar;
    private LocationManager locationManager;


    @Override
    public void onEnable() {
            
            
            plugin = this;
            instance = this;
                mortar = MortarLibrary.link(this);
                locationManager = new LocationManager();
        npcRegistry = mortar.getNpcRegistry();

        // Disable auto-save for protected worlds
        getServer().getWorlds().forEach(world -> {
            if (WorldSaveListener.isProtectedWorld(world.getName())) {
                world.setAutoSave(false);
            }
        });
        

        // Command registration
        SkyBlockLogger.info(ChatColor.GREEN + "Registering commands...");
        initializeCommands();
        registerCommands();
        SkyBlockLogger.info(ChatColor.GREEN + "Registered commands!");

        // Config
        SkyBlockLogger.info(ChatColor.GREEN + "Loading Configuration");
        
        config = new Config("config.yml");
        loadConfig();

        // Event registration
        SkyBlockLogger.info(ChatColor.GREEN + "Registering events...");
        registerEvents();
        SkyBlockLogger.info(ChatColor.GREEN + "Registered events!");

        // NPCs
        SkyBlockLogger.info(ChatColor.GREEN + "Loading NPCs...");
        loadNPCs();

        // Game rule setup
        SkyBlockLogger.info(ChatColor.GREEN  + "Initializing Gamerules...");
        initializeGameRules();
        SkyBlockLogger.info(ChatColor.GREEN + "Initialized Gamerules!");

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

        npcRegistry = null;
        mortar = null;


        SkyBlockLogger.info("Saving user data...");

        for (User user : User.getCachedUsers())
            user.save();

        // Re-enable auto-save for protected worlds
        getServer().getWorlds().forEach(world -> {
            if (WorldSaveListener.isProtectedWorld(world.getName())) {
                world.setAutoSave(true);
            }
        });
    }

    public void initializeGameRules() {
        List<World> worlds = Bukkit.getWorlds();
        for (World world : worlds) {
            world.setGameRuleValue("doWeatherCycle", "false");
            world.setGameRuleValue("doFireTick", "false");
            world.setGameRuleValue("doMobSpawning", "false");
            world.setGameRuleValue("doMobLoot", "false");
            world.setGameRuleValue("doTileDrops", "false");
            world.setGameRuleValue("naturalRegeneration", "false");
            world.setGameRuleValue("showDeathMessages", "false");
            world.setGameRuleValue("randomTickSpeed", "0");
            world.setGameRuleValue("announceAdvancements", "false");
            world.setGameRuleValue("fallDamage", "false");
        }
    }

    public void initializeCommands() {
        getCommand("kaboom").setExecutor(new KaboomCommand(this));
        getCommand("fly").setExecutor(new FlyCommand(this));
        getCommand("debug").setExecutor(new DebugCommand(this));
        getCommand("ping").setExecutor(new PingCommand(this));
        getCommand("boop").setExecutor(new BoopCommand(this));
        getCommand("op").setExecutor(new OpCommand(this));
        getCommand("gm").setExecutor(new Gamemode(this));
        getCommand("reboot").setExecutor(new RebootCommand(this));
        getCommand("maintenance").setExecutor(new MaintenanceCommand());
        getCommand("help").setExecutor(new HelpCommand());
        getCommand("bypass").setExecutor(new BypassCommand());
        getCommand("mute").setExecutor(new Mute());
        getCommand("unmute").setExecutor(new Unmute());
        getCommand("kick").setExecutor(new Kick());
        getCommand("tempban").setExecutor(new TempBan());
        getCommand("ban").setExecutor(new Ban());
        getCommand("unban").setExecutor(new Unban());
        getCommand("replacehubportal").setExecutor(new ReplaceHubPortalCommand());
        getCommand("noportal").setExecutor(new NoPortalCommand(this));
        getCommand("reloadSkyblockGame").setExecutor(new ReloadCommand(this));
        getCommand("godmode").setExecutor(new GodModeCommand());
        getCommand("coins").setExecutor(new CoinsCommand());
        getCommand("setrank").setExecutor(new SetRankCommand());
        getCommand("skyblockxp").setExecutor(new SkyblockXPCommand());
    }

    public void registerEvents() {
        // Register all event listeners
       getServer().getPluginManager().registerEvents(new InventoryClick(), this);
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerChatListener(), this);
        getServer().getPluginManager().registerEvents(new WorldSaveListener(), this);
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
        Bukkit.getPluginManager().registerEvents(new JoinLeaveEvent(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerChat(), this);
        Bukkit.getPluginManager().registerEvents(new LocationListener(locationManager), this);
    }

    public void loadConfig() {
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
    }

public void loadNPCs() {
        // Hub
        npcRegistry.register(new AuctionMaster(), false);
        npcRegistry.register(new Bea(), false);
        npcRegistry.register(new HubSelector(), false);
        npcRegistry.register(new SecuritySloth(), false);
        npcRegistry.register(new Salesman(), false);
        npcRegistry.register(new Curator(), false);
        npcRegistry.register(new MadameEleanorQGoldsworthIII(), false);
        npcRegistry.register(new LumberJack(), false);
        
        // Removed (set location to 0 0 0, alright?)
        npcRegistry.register(new Dante(), false);
        
        // The Park
        npcRegistry.register(new Charlie(), false);
        npcRegistry.register(new Gustave(), false);
        npcRegistry.register(new Juliette(), false);
        npcRegistry.register(new MasterTacticianFunk(), false);
        npcRegistry.register(new JoyfulViking(), false);
        npcRegistry.register(new Melody(), false);
        npcRegistry.register(new OldShamanNyko(), false);
        npcRegistry.register(new Romero(), false);
        npcRegistry.register(new Ryan(), false);
        npcRegistry.register(new Vanessa(), false);
        
        // The End
        npcRegistry.register(new Tyzzo(), false);
        
        // Custom
        npcRegistry.register(new Zero(), false);
        
        npcRegistry.startTasks();
    }
    
    public static SkyblockGame getInstance() {
        return instance;
    }
    
    private void registerCommands(){
        SkyBlockLogger.info("Registering commands...");
        int registered = 0;
        for (Class< ? extends SkyBlockCommand> clazz : new Reflections("me.zero.skyblock.commands")
                .getSubTypesOf(SkyBlockCommand.class)){
            try {
                SkyBlockCommand skyBlockCommand = clazz.getDeclaredConstructor().newInstance();
                skyBlockCommand.register();
                registered++;
            } catch (InstantiationException | NoSuchMethodException | InvocationTargetException |
                     IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        SkyBlockLogger.info("Successfully registered " + registered + " commands.");
    }

}