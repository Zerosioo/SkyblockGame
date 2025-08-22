package me.zero.skyblock.mayors;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCMeta;
import me.zero.mortar.utils.CandidatePacketUtils;
import me.zero.skyblock.npcs.mayors.*;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MayorManager {

	private static final List<Mayor> ALL_MAYORS = new ArrayList<>();
	private static final List<Mayor> SELECTED_CANDIDATES = new ArrayList<>();
	private static final Map<Mayor, MortarNPC> SPAWNED_NPCS = new HashMap<>();

	private static Location loc1, loc2, loc3, loc4, loc5;
	private static Mayor activeMayor;

	public static void registerMayor(Mayor mayor) {
		for (Mayor m : ALL_MAYORS) {
			if (m.getId().equals(mayor.getId())) {
				return; 
			}
		}
		ALL_MAYORS.add(mayor);
	}

	public static void setCandidateLocations(Location l1, Location l2, Location l3, Location l4, Location l5) {
		loc1 = l1;
		loc2 = l2;
		loc3 = l3;
		loc4 = l4;
		loc5 = l5;
	}

	public static void spawnRandomisedCandidates() {
		SELECTED_CANDIDATES.clear();
		SPAWNED_NPCS.clear();
		List<Mayor> shuffled = new ArrayList<>(ALL_MAYORS);
		Collections.shuffle(shuffled);
		SELECTED_CANDIDATES.addAll(shuffled.subList(0, 5));

		spawnCandidate(SELECTED_CANDIDATES.get(0), loc1);
		spawnCandidate(SELECTED_CANDIDATES.get(1), loc2);
		spawnCandidate(SELECTED_CANDIDATES.get(2), loc3);
		spawnCandidate(SELECTED_CANDIDATES.get(3), loc4);
		spawnCandidate(SELECTED_CANDIDATES.get(4), loc5);
		injectCandidates();
	}

	public static void despawnAllCandidates() {
		for (Mayor mayor : SELECTED_CANDIDATES) {
			MortarNPC npc = mayor.createNPC();
			for (Player player : Bukkit.getOnlinePlayers()) {
				npc.despawn(player);
			}
		}

		uninjectCandidates();
		injectCandidates();
	}


	private static void spawnCandidate(Mayor mayor, Location location) {
		MortarNPC npc = mayor.createNPC();
		npc.getLocation().setWorld(location.getWorld());
		npc.getLocation().setX(location.getX());
		npc.getLocation().setY(location.getY());
		npc.getLocation().setZ(location.getZ());
		npc.getLocation().setYaw(location.getYaw());
		npc.getLocation().setPitch(location.getPitch());
		npc.load();
		npc.spawn();

		// Store NPC reference for despawning
		injectCandidates();
		SPAWNED_NPCS.put(mayor, npc);
	}

	public static void spawnElectedMayor(Location location, int candidateNo) {
		if (candidateNo < 1 || candidateNo > SELECTED_CANDIDATES.size()) {
			Bukkit.getLogger().warning("Invalid candidate number.");
			return;
		}

		activeMayor = SELECTED_CANDIDATES.get(candidateNo - 1);
		MortarNPC npc = activeMayor.createNPC();
		npc.getLocation().setWorld(location.getWorld());
		npc.getLocation().setX(location.getX());
		npc.getLocation().setY(location.getY());
		npc.getLocation().setZ(location.getZ());
		npc.getLocation().setYaw(location.getYaw());
		npc.getLocation().setPitch(location.getPitch());
		npc.load();
		npc.spawn();

		activeMayor.onActive();
		SELECTED_CANDIDATES.clear();
		SPAWNED_NPCS.clear();
	}

	public static Mayor getCandidateMayor(int slot) {
		if (slot < 1 || slot > 5 || SELECTED_CANDIDATES.size() < slot) {
			return null;
		}
		return SELECTED_CANDIDATES.get(slot - 1);
	}

	public static MortarNPC getCandidateNPC(int slot) {
		Mayor mayor = getCandidateMayor(slot);
		if (mayor == null) {
			return null;
		}
		return SPAWNED_NPCS.get(mayor);
	}

	public static NPCMeta getCandidateMeta(int slot) {
		MortarNPC npc = getCandidateNPC(slot);
		if (npc == null) {
			return null;
		}
		return npc.getMeta();
	}

	public static Collection<MortarNPC> getSpawnedNPCs() {
		return SPAWNED_NPCS.values();
	}

	public static void injectCandidates() {
		for (Player player : Bukkit.getOnlinePlayers()) {
			CandidatePacketUtils.inject(player);
		}
	}

	public static void uninjectCandidates() {
		for (Player player : Bukkit.getOnlinePlayers()) {
			CandidatePacketUtils.uninject(player);
		}
	}


}
