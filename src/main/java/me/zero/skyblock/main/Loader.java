package me.zero.skyblock.main;

import me.zero.skyblock.commands.*;
import me.zero.skyblock.commands.abstraction.SkyBlockCommand;
import me.zero.skyblock.farming.CropManager;
import me.zero.skyblock.items.build.Lists;
import me.zero.skyblock.listeners.*;
import me.zero.skyblock.location.LocationListener;
import me.zero.skyblock.location.LocationManager;
import me.zero.skyblock.mayors.ElectionVoteManager;
import me.zero.skyblock.mayors.MayorElectionTiming;
import me.zero.skyblock.mayors.MayorLocalization;
import me.zero.skyblock.ranks.*;
import me.zero.mortar.MortarLibrary;
import me.zero.mortar.npc.*;
import me.zero.skyblock.npcs.hub.*;
import me.zero.skyblock.npcs.hub.museum.*;
import me.zero.skyblock.npcs.removed.*;
import me.zero.skyblock.pads.Pads;
import me.zero.skyblock.pads.TeleportPad;
import me.zero.skyblock.npcs.park.*;
import me.zero.skyblock.npcs.end.*;
import me.zero.skyblock.npcs.custom.*;
import me.zero.skyblock.user.*;
import me.zero.skyblock.util.*;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.event.Listener;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;

import java.lang.reflect.InvocationTargetException;

import java.util.Set;
import java.util.HashSet;

public class Loader {

	private final SkyblockGame plugin;
	private static MortarLibrary mortar;
	private static NPCRegistry npcRegistry;
	private final LocationManager locationManager;
	MayorElectionTiming evt = new MayorElectionTiming(SkyblockGame.getPlugin(SkyblockGame.class));

	public Loader(SkyblockGame plugin) {
		this.plugin = plugin;
		this.locationManager = new LocationManager();
	}

	public final LocationManager getLocationManager() {
		return locationManager;
	}

	public MortarLibrary getMortar() {
		return mortar;
	}

	public static NPCRegistry getNpcRegistry() {
		return npcRegistry;
	}

	public void load() {
		print("&aInitializing Mortar Library...");
		mortar = MortarLibrary.link(plugin);
		npcRegistry = mortar.getNpcRegistry();

		print("&eDisabling auto-save for protected worlds...");
		disableWorldAutoSave();

		print("&aRegistering commands...");
		registerCommands();

		print("&aRegistering events...");
		registerEvents();

		print("&aLoading NPCs...");
		loadNPCs();

		print("&aInitializing game rules...");
		initializeGameRules();

		print("&aInitializing items..");
		Lists.registerItems();

		print("&aInitializing teleport pads..");

		Pads.register();
		TeleportPad.startMonitoring();
		print("&cStarting Skyblock Year Counting...");

		SkyblockYear.startYearCounting(SkyblockGame.getPlugin(SkyblockGame.class), 20L);

		print("&aInitializing Mayors & starting election counting...");

		//MayorLocalization.registerCandidates();
//		MayorLocalization.setCandidatePositions();
		ElectionVoteManager.initialize(SkyblockGame.getPlugin(SkyblockGame.class).getDataFolder());

		evt.start();
		
		print("&aInitializing crops");
		
		CropManager.registerDefaults();
		
		print("&aPlugin successfully loaded!");
	}

	public void deload() {

		SkyBlockLogger.info("&eDisabling Worlds & stuff.");


		npcRegistry = null;
		mortar = null;


		print("&aSaving user data...");

		for (User user : User.getCachedUsers())
			user.save();

		disableWorldAutoSave();

		HologramUtil.removeHolograms();
		ElectionVoteManager.removeAllVotesAndCandidates();

		for (World world : Bukkit.getWorlds()) {
			for (Entity entity : world.getEntities()) {
				if (entity instanceof ArmorStand) {
					entity.remove();
				}
			}
		}

	}

	private void print(String m) {
		SkyBlockLogger.sendMessage(m);
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
		print("&aSuccessfully registered " + registered + " commands.");
	}

	private void registerEvents() {
		Set<Listener> listeners = new HashSet<>();
		listeners.add(new InventoryClick());
		listeners.add(new WorldListener());
		listeners.add(new JoinLeaveEvent());
		listeners.add(new PlayerChat());
		listeners.add(new ServerPingListener());
		listeners.add(new LocationListener(locationManager));
		listeners.add(new PlayerListener());
		listeners.add(new ElectionJukeBox());
		listeners.add(new CandidateInteractionListener());
		listeners.add(new CropListener());

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
