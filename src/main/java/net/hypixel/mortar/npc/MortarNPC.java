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
package me.zero.mortar.npc;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

import lombok.Getter;
import lombok.SneakyThrows;

import net.minecraft.server.v1_8_R3.*;

import me.zero.mortar.MortarLibrary;
import me.zero.mortar.utils.Hologram;
import me.zero.mortar.utils.MortarUtils;

import static me.zero.mortar.utils.PacketUtils.send;
import static me.zero.mortar.utils.PacketUtils.set;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.*;

@SuppressWarnings({"unused", "FieldMayBeFinal", "FieldCanBeLocal"})
public abstract class MortarNPC {
    private static Map<UUID, HashMap<Integer, Hologram>> HOLOGRAMS = new HashMap<>();

    private List<PacketPlayOutSpawnEntityLiving> SHOW_PACKETS = new ArrayList<>();
    private List<PacketPlayOutEntityDestroy> HIDE_PACKETS = new ArrayList<>();
    private List<Object> META_PACKETS = new ArrayList<>();
    private PacketPlayOutNamedEntitySpawn spawnPacket;

    @Getter
    private NPCMeta meta;
    private int entityId;
    @Getter
    private Location location;
    private GameProfile gameProfile;
    private String texture;
    private String signature;

    private List<Player> ALREADY_SPAWNED = new ArrayList<>();
    private List<Player> ALREADY_DESPAWNED = new ArrayList<>();
    private List<Player> ALREADY_SPEAKING = new ArrayList<>();

    public MortarNPC(NPCMeta meta) {
        this.meta = meta;

        entityId = meta.getId() + 5000;
        gameProfile = new GameProfile(UUID.randomUUID(), MortarUtils.color("&e&lCLICK"));
        texture = meta.getTexture();
        signature = meta.getSignature();
        location = new Location(Bukkit.getWorld(meta.getWorldName()), meta.getX(), meta.getY(), meta.getZ(), meta.getYaw(), meta.getPitch());
    }

    public void load() {
        PacketPlayOutNamedEntitySpawn packet = new PacketPlayOutNamedEntitySpawn();

        set(packet, "a", entityId);
        set(packet, "b", gameProfile.getId());

        set(packet, "c", getFixedLocation(location.getX()));
        set(packet, "d", getFixedLocation(location.getY()));
        set(packet, "e", getFixedLocation(location.getZ()));

        set(packet, "f", getFixedRotation(location.getYaw()));
        set(packet, "g", getFixedRotation(location.getPitch()));

        set(packet, "h", 0);

        DataWatcher watcher = new DataWatcher(null);

        watcher.a(6, 20.0F);
        watcher.a(10, (byte) 127);

        set(packet, "i", watcher);

        gameProfile.getProperties().put("textures", new Property("textures", this.texture, this.signature));
        spawnPacket = packet;
    }

    public void spawn() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            spawn(player);
        }
    }

    public void spawn(Player player) {
        if (ALREADY_SPAWNED.contains(player)) {
            return;
        }

        if (spawnPacket == null) {
            load();
        }

        addToTab(player);
        send(spawnPacket, player);

        new BukkitRunnable() {
            @Override
            public void run() {
                removeFromTab(player);
            }
        }.runTaskLater(MortarLibrary.getLibrary().getPlugin(), 20);

        Hologram hologram = new Hologram("NPC-" + UUID.randomUUID().toString().substring(0, 10), location.clone().add(0, 0.8, 0), meta.getHolograms());
        HashMap<Integer, Hologram> playerHolograms = HOLOGRAMS.getOrDefault(player.getUniqueId(), new HashMap<>());

        if (playerHolograms.containsKey(entityId)) {
            playerHolograms.get(entityId).hide(player);
        }

        playerHolograms.put(entityId, hologram);
        HOLOGRAMS.put(player.getUniqueId(), playerHolograms);

        ALREADY_SPAWNED.add(player);
        ALREADY_DESPAWNED.remove(player);

        new BukkitRunnable() {
            @Override
            public void run() {
                hologram.show(player);
            }
        }.runTaskLater(MortarLibrary.getLibrary().getPlugin(), 10);
    }

    public void despawn(Player player) {
        if (ALREADY_DESPAWNED.contains(player)) {
            return;
        }

        removeFromTab(player);

        PacketPlayOutEntityDestroy packet = new PacketPlayOutEntityDestroy(entityId);
        send(packet, player);

        if (HOLOGRAMS.get(player.getUniqueId()) != null && HOLOGRAMS.get(player.getUniqueId()).containsKey(entityId)) {
            HOLOGRAMS.get(player.getUniqueId()).get(entityId).hide(player);
            HOLOGRAMS.get(player.getUniqueId()).remove(entityId);
        }

        ALREADY_DESPAWNED.add(player);
        ALREADY_SPAWNED.remove(player);
    }

    @SneakyThrows
    @SuppressWarnings("unchecked")
    private void addToTab(Player player) {
        PacketPlayOutPlayerInfo packet = new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER);

        Field field = packet.getClass().getDeclaredField("b");
        field.setAccessible(true);

        List<Object> players = (List<Object>) field.get(packet);

        Constructor<?> constructor = PacketPlayOutPlayerInfo.PlayerInfoData.class.getDeclaredConstructor(PacketPlayOutPlayerInfo.class, GameProfile.class, int.class, WorldSettings.EnumGamemode.class, IChatBaseComponent.class);
        constructor.setAccessible(true);

        PacketPlayOutPlayerInfo.PlayerInfoData data = (PacketPlayOutPlayerInfo.PlayerInfoData) constructor.newInstance(packet, gameProfile, 1, WorldSettings.EnumGamemode.NOT_SET, IChatBaseComponent.ChatSerializer.a(getMeta().getName()));

        players.add(data);
        field.set(packet, players);

        send(packet, player);
    }

    @SneakyThrows
    @SuppressWarnings("unchecked")
    private void removeFromTab(Player player) {
        PacketPlayOutPlayerInfo packet = new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER);

        Field field = packet.getClass().getDeclaredField("b");
        field.setAccessible(true);

        List<Object> players = (List<Object>) field.get(packet);

        Constructor<?> constructor = PacketPlayOutPlayerInfo.PlayerInfoData.class.getDeclaredConstructor(PacketPlayOutPlayerInfo.class, GameProfile.class, int.class, WorldSettings.EnumGamemode.class, IChatBaseComponent.class);
        constructor.setAccessible(true);

        PacketPlayOutPlayerInfo.PlayerInfoData data = (PacketPlayOutPlayerInfo.PlayerInfoData) constructor.newInstance(packet, gameProfile, 1, WorldSettings.EnumGamemode.NOT_SET, null);

        players.add(data);
        field.set(packet, players);

        send(packet, player);
    }

    public void look(Player player) {
        Location loc = location.setDirection(player.getLocation().subtract(location).toVector());

        float yaw = loc.getYaw();
        float pitch = loc.getPitch();

        PacketPlayOutEntity.PacketPlayOutEntityLook packet = new PacketPlayOutEntity.PacketPlayOutEntityLook(entityId, getFixedRotation(yaw), getFixedRotation(pitch), true);
        PacketPlayOutEntityHeadRotation headPacket = new PacketPlayOutEntityHeadRotation();

        set(headPacket, "a", entityId);
        set(headPacket, "b", getFixedRotation(yaw));

        send(packet, player);
        send(headPacket, player);
    }

    public void onInteract(NPCInteractionEvent event) {}

    public void speak(Player player, List<String> messages) {
        if (ALREADY_SPEAKING.contains(player)) {
            return;
        }

        int total = 0;

        for (int i = 0; i < messages.size(); i++) {
            String message = messages.get(i);

            total += 1;

            new BukkitRunnable() {
                @Override
                public void run() {
                    speak(player, message, false);
                }
            }.runTaskLater(MortarLibrary.getLibrary().getPlugin(), i * 30L);
        }

        ALREADY_SPEAKING.add(player);

        new BukkitRunnable() {
            @Override
            public void run() {
                ALREADY_SPEAKING.remove(player);
            }
        }.runTaskLater(MortarLibrary.getLibrary().getPlugin(), total * 35L);
    }

    public void speak(Player player, String message) {
        speak(player, message, true);
    }

    public void speak(Player player, String message, boolean makeCd) {
        NPCVoiceType voice = getMeta().getVoiceType();

        player.playSound(player.getLocation(), Sound.VILLAGER_YES, 10, voice.getPitch());
        player.sendMessage(MortarUtils.color("&e[NPC] " + getMeta().getDisplayName() + ": &f" + message));

        if (makeCd) {
            ALREADY_SPEAKING.add(player);

            new BukkitRunnable() {
                @Override
                public void run() {
                    ALREADY_SPEAKING.remove(player);
                }
            }.runTaskLater(MortarLibrary.getLibrary().getPlugin(), 20);
        }
    }
    
    
    
    public void security(Player player, String message, boolean makeCd) {
        NPCVoiceType voice = getMeta().getVoiceType();

        player.playSound(player.getLocation(), Sound.VILLAGER_YES, 10, voice.getPitch());
        player.sendMessage(MortarUtils.color("&c[SECURITY] " + getMeta().getDisplayName() + ": &f" + message));

        if (makeCd) {
            ALREADY_SPEAKING.add(player);

            new BukkitRunnable() {
                @Override
                public void run() {
                    ALREADY_SPEAKING.remove(player);
                }
            }.runTaskLater(MortarLibrary.getLibrary().getPlugin(), 20);
        }
    }

    private int getFixedLocation(double position) {
        return MathHelper.floor(position * 32D);
    }

    private byte getFixedRotation(float rotation) {
        return (byte) Math.round(rotation * 256F / 360F);
    }
}
