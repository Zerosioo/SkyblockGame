package me.zero.mortar.utils;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import lombok.SneakyThrows;
import me.zero.skyblock.mayors.MayorManager;
import net.minecraft.server.v1_8_R3.Packet;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class CandidatePacketUtils {

    private static final List<Player> INJECTED = new ArrayList<>();
    private static final List<Channel> CHANNELS = new ArrayList<>();

    public static void inject(Player player) {
        if (INJECTED.contains(player)) return;

        CraftPlayer craftPlayer = (CraftPlayer) player;
        Channel channel = craftPlayer.getHandle().playerConnection.networkManager.channel;

        if (channel.pipeline().get("CandidatePacketInjector") != null) {
            INJECTED.add(player);
            return;
        }

        CHANNELS.add(channel);
        channel.pipeline().addAfter("decoder", "CandidatePacketInjector",
            new MessageToMessageDecoder<Packet<?>>() {
                @Override
                protected void decode(ChannelHandlerContext ctx, Packet<?> packet, List<Object> out) throws Exception {
                    out.add(packet);
                    read(player, packet);
                }
            });

        INJECTED.add(player);
    }

    private static void read(Player player, Packet<?> packet) {
        if (packet.getClass().getSimpleName().equalsIgnoreCase("PacketPlayInUseEntity")) {
            int entityId = (Integer) get(packet, "a");

            // Only check against spawned candidate NPCs:
            MayorManager.getSpawnedNPCs().forEach(npc -> {
                if (npc.getEntityId() == entityId) {
                    try {
                        Object action = get(packet, "action");
                        if (action.toString().equalsIgnoreCase("ATTACK") || action.toString().equalsIgnoreCase("INTERACT")) {
                            if (player.isSneaking()) {
                                npc.onInteract(new me.zero.mortar.npc.NPCInteractionEvent(npc, me.zero.mortar.npc.NPCActionType.SHIFT_CLICK_NPC, entityId, player));
                            } else {
                                npc.onInteract(new me.zero.mortar.npc.NPCInteractionEvent(npc, me.zero.mortar.npc.NPCActionType.CLICK_NPC, entityId, player));
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @SneakyThrows
    public static Object get(Object obj, String name) {
        Field field = obj.getClass().getDeclaredField(name);
        field.setAccessible(true);
        return field.get(obj);
    }

    public static void uninject(Player player) {
        if (!INJECTED.contains(player)) return;

        CraftPlayer craftPlayer = (CraftPlayer) player;
        Channel channel = craftPlayer.getHandle().playerConnection.networkManager.channel;

        if (channel.pipeline().get("CandidatePacketInjector") != null) {
            channel.pipeline().remove("CandidatePacketInjector");
        }

        INJECTED.remove(player);
        CHANNELS.remove(channel);
    }

    public static boolean isInjected(Player player) {
        return INJECTED.contains(player);
    }
}
