package me.zero.mortar.npc;

import lombok.NonNull;

import me.zero.mortar.MortarLibrary;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@SuppressWarnings({"FieldMayBeFinal", "unused"})
public class NPCRegistry {
	private static List<MortarNPC> NPC_LIST = new ArrayList<>();
	private static Map<Integer, MortarNPC> ENTITY_ID_MAP = new HashMap<>();
	private static List<MortarNPC> IGNORED_NPCS = new ArrayList<>();



	public void register(MortarNPC npc, boolean spawn) {
		NPC_LIST.add(npc);
		ENTITY_ID_MAP.put(npc.getEntityId(), npc);
		npc.load();

		if (spawn) {
			npc.spawn();
		}
	}

	public void registerWithoutAuto(MortarNPC npc) {
		NPC_LIST.add(npc);
		IGNORED_NPCS.add(npc);
	}




	public @NonNull Optional<MortarNPC> getByName(@NonNull String name) {
		return NPC_LIST.stream()
			   .filter(npc -> npc.getMeta().getName().equals(name))
			   .findFirst();
	}

	public @NonNull Optional<MortarNPC> getByID(int id) {
		return Optional.ofNullable(ENTITY_ID_MAP.get(id));
	}



	public void spawnAll(Player player) {
		NPC_LIST.forEach(npc -> npc.spawn(player));
	}

	public void despawnAll(Player player) {
		NPC_LIST.forEach(npc -> npc.despawn(player));
	}

	public void spawnSingle(MortarNPC npc) {
		if (npc != null) {
			for (Player player : Bukkit.getOnlinePlayers()) {
				npc.spawn(player);
			}
		}
	}

	public void despawnSingle(MortarNPC npc) {
		if (npc != null) {
			for (Player player : Bukkit.getOnlinePlayers()) {
				npc.despawn(player);
			}
		}
	}


	public void startTasks() {
		new BukkitRunnable() {
			@Override
			public void run() {
				NPC_LIST.forEach(npc -> {

					if (npc.getMeta().canLook()) {
						for (Entity entity : npc.getLocation().getWorld().getNearbyEntities(npc.getLocation(), 7, 7, 7)) {
							if (entity instanceof Player) {
								npc.look((Player) entity);
							}
						}
					}
				});

				List<Player> online = new ArrayList<>(Bukkit.getOnlinePlayers());
				for (Player player : online) {
					NPC_LIST.forEach(npc -> {

						boolean playerFound = false;
						for (Entity entity : npc.getLocation().getWorld().getNearbyEntities(npc.getLocation(), 30, 30, 30)) {
							if (entity instanceof Player) {
								if (entity.equals(player)) {
									playerFound = true;
								}
							}
						}

						if (!playerFound) {
							npc.despawn(player);
						} else {
							npc.spawn(player);
						}
					});
				}
			}
		} .runTaskTimer(MortarLibrary.getLibrary().getPlugin(), 0, 3);
	}

}
