package me.zero.mortar.utils;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import lombok.SneakyThrows;

import net.minecraft.server.v1_8_R3.Packet;

import me.zero.mortar.MortarLibrary;
import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCActionType;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCRegistry;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PacketUtils {
	//Packet Reader
	private static List<Player> INJECTED = new ArrayList<>();
	private static List<Channel> CHANNELS = new ArrayList<>();

	public static void inject(Player player) {
		if (INJECTED.contains(player)) {
			return; // Already injected, don't inject again
		}

		CraftPlayer craftPlayer = (CraftPlayer) player;
		Channel channel = (craftPlayer.getHandle()).playerConnection.networkManager.channel;

		if (channel.pipeline().get("PacketInjector") != null) {
			INJECTED.add(player);
			return; // Already injected into pipeline
		}

		CHANNELS.add(channel);
		channel.pipeline().addAfter("decoder", "PacketInjector",
		new MessageToMessageDecoder<Packet<?>>() {
			@Override
			protected void decode(ChannelHandlerContext context, Packet<?> packet, List<Object> packets) throws Exception {
				packets.add(packet);
				read(player, packet);
			}
		});

		INJECTED.add(player);
	}


	private static void read(Player player, Packet<?> packet) {
		if (packet.getClass().getSimpleName().equalsIgnoreCase("PacketPlayInUseEntity")) {
			int entityId = (Integer) get(packet, "a"); // <-- DO NOT subtract 5000 here anymore!

			NPCRegistry registry = MortarLibrary.getLibrary().getNpcRegistry();
			Optional<MortarNPC> npcOptional = registry.getByID(entityId);

			if (!npcOptional.isPresent()) return;

			MortarNPC NPC = npcOptional.get();
			if (get(packet, "action").toString().equalsIgnoreCase("ATTACK") || get(packet, "action").toString().equalsIgnoreCase("INTERACT")) {
				if (player.isSneaking()) {
					NPC.onInteract(new NPCInteractionEvent(NPC, NPCActionType.SHIFT_CLICK_NPC, entityId, player));
				} else {
					NPC.onInteract(new NPCInteractionEvent(NPC, NPCActionType.CLICK_NPC, entityId, player));
				}
			}
		}
	}


	//Utility Methods
	@SneakyThrows
	public static void set(Object obj, String name, Object value) {
		Field field = obj.getClass().getDeclaredField(name);

		field.setAccessible(true);
		field.set(obj, value);
	}

	@SneakyThrows
	public static Object get(Object obj, String name) {
		Field field = obj.getClass().getDeclaredField(name);

		field.setAccessible(true);
		return field.get(obj);
	}

	public static void send(Packet<?> packet, Player player) {
		(((CraftPlayer) player).getHandle()).playerConnection.sendPacket(packet);
	}

	public static void send(Packet<?> packet) {
		Bukkit.getOnlinePlayers().forEach(player -> send(packet, player));
	}

	public static boolean isInjected(Player player) {
		return INJECTED.contains(player);
	}

	public static void uninject(Player player) {
		if (!isInjected(player)) return;

		CraftPlayer craftPlayer = (CraftPlayer) player;
		Channel channel = (craftPlayer.getHandle()).playerConnection.networkManager.channel;

		if (channel.pipeline().get("PacketInjector") != null) {
			channel.pipeline().remove("PacketInjector");
		}

		INJECTED.remove(player);
		CHANNELS.remove(channel);
	}


}
