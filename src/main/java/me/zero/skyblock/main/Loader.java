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
import java.lang.reflect.InvocationTargetException;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Loader {

    private final SkyblockGame plugin;
    @Getter
    private static MortarLibrary mortar;
    @Getter
    private static NPCRegistry npcRegistry;
    private final LocationManager locationManager;

    public Loader(SkyblockGame plugin) {
        this.plugin = plugin;
        this.locationManager = new LocationManager();
    }

    public void load() {
        SkyBlockLogger.info(ChatColor.GREEN + "Initializing Mortar Library...");
        mortar = MortarLibrary.link(plugin);
        npcRegistry = mortar.getNpcRegistry();

        SkyBlockLogger.info(ChatColor.GREEN + "Disabling auto-save for protected worlds...");
        disableWorldAutoSave();

        SkyBlockLogger.info(ChatColor.GREEN + "Registering commands...");
        registerCommands();

        SkyBlockLogger.info(ChatColor.GREEN + "Loading configuration...");
        plugin.loadConfig();

        SkyBlockLogger.info(ChatColor.GREEN + "Registering events...");
        registerEvents();

        SkyBlockLogger.info(ChatColor.GREEN + "Loading NPCs...");
        loadNPCs();

        SkyBlockLogger.info(ChatColor.GREEN + "Initializing game rules...");
        initializeGameRules();

        SkyBlockLogger.info(ChatColor.GREEN + "Plugin successfully loaded!");
    }
    
    public void deload() {
    	
    	SkyBlockLogger.info("Disabling Worlds & stuff.");
    	

        npcRegistry = null;
        mortar = null;


        SkyBlockLogger.info("Saving user data...");

        for (User user : User.getCachedUsers())
            user.save();

        disableWorldAutoSave();
    	
    }

    private void disableWorldAutoSave() {
        Bukkit.getWorlds().forEach(world -> {
            if (WorldListener.isProtectedWorld(world.getName())) {
                world.setAutoSave(false);
            }
        });
    }

    private void registerCommands() {
        int registered = 0;
        for (Class<? extends SkyBlockCommand> clazz : ReflectionsReplacement.getSubTypesOf("me.zero.skyblock.commands")) {
            try {
                SkyBlockCommand command = clazz.getDeclaredConstructor().newInstance();
                command.register();
                registered++;
            } catch (InstantiationException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        SkyBlockLogger.info("Successfully registered " + registered + " commands.");
    }

    private void registerEvents() {
        Set<Listener> listeners = new HashSet<>();
        listeners.add(new InventoryClick());
        listeners.add(new PlayerListener());
        listeners.add(new PlayerChatListener());
        listeners.add(new WorldListener());
        listeners.add(new ChatListener());
        listeners.add(new JoinLeaveEvent());
        listeners.add(new PlayerChat());
        listeners.add(new LocationListener(locationManager));

        listeners.forEach(listener -> Bukkit.getPluginManager().registerEvents(listener, plugin));
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

    private void initializeGameRules() {
        Bukkit.getWorlds().forEach(world -> {
            world.setGameRuleValue("doWeatherCycle", "false");
            world.setGameRuleValue("doFireTick", "false");
            world.setGameRuleValue("doMobSpawning", "false");
            world.setGameRuleValue("doMobLoot", "false");
            world.setGameRuleValue("doTileDrops", "false");
            world.setGameRuleValue("naturalRegeneration", "false");
            world.setGameRuleValue("showDeathMessages", "false");
            world.setGameRuleValue("randomTickSpeed", "0");
            world.setGameRuleValue("announceAdvancements", "false");
        });
    }
}
