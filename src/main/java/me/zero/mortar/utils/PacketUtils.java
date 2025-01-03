/*
 * Copyright (C) 2023 by Ruby Game Studios
 * Mortar is apart of Skyblock, which is licensed under the Creative Commons Non-Commercial 4.0 International License.
 *
 * You may not use this software for commercial use, however you are free
 * to modify, copy, redistribute, or build upon our codebase. You must give
 * appropriate credit, provide a link to the license, and indicate
 * if changes were made.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * For more information, visit https://creativecommons.org/licenses/by-nc/4.0/legalcode
 */
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
            throw new UnsupportedOperationException("Player " + player.getName() + " has already been injected!");
        }

        CraftPlayer craftPlayer = (CraftPlayer) player;

        Channel channel = (craftPlayer.getHandle()).playerConnection.networkManager.channel;

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
            int id = (Integer) get(packet, "a") - 5000;
            NPCRegistry registry = MortarLibrary.getLibrary().getNpcRegistry();


            Optional<MortarNPC> npcOptional = registry.getByID(id);

            if (!npcOptional.isPresent()) return;

            MortarNPC NPC = npcOptional.get();
            if (get(packet, "action").toString().equalsIgnoreCase("ATTACK") || get(packet, "action").toString().equalsIgnoreCase("INTERACT")) {
                if (player.isSneaking()) {
                    NPC.onInteract(new NPCInteractionEvent(NPC, NPCActionType.SHIFT_CLICK_NPC, id, player));
                } else {
                    NPC.onInteract(new NPCInteractionEvent(NPC, NPCActionType.CLICK_NPC, id, player));
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
}
