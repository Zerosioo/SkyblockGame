package me.zero.skyblock.pads;

import org.bukkit.*;
import org.bukkit.entity.Player;
import me.zero.skyblock.main.SkyblockGame;

import java.util.*;

public class TeleportPad {

    private static final Set<TeleportPad> pads = new HashSet<>();
    private static final Map<UUID, Integer> tickCounters = new HashMap<>();
    private static final Map<UUID, Long> cooldowns = new HashMap<>();

    private final Location from;
    private final Location to;
    private final String forwardMessage;
    private final String backwardMessage;

    public TeleportPad(Location from, Location to, String forwardMessage, String backwardMessage) {
        this.from = new Location(
            from.getWorld(),
            from.getX(),
            from.getY(),
            from.getZ(),
            from.getYaw(),
            from.getPitch()
        );

        this.to = new Location(
            to.getWorld(),
            to.getX(),
            to.getY(),
            to.getZ(),
            to.getYaw(),
            to.getPitch()
        );

        this.forwardMessage = forwardMessage;
        this.backwardMessage = backwardMessage;
        pads.add(this);
    }

    public static void startMonitoring() {
        Bukkit.getScheduler().runTaskTimer(SkyblockGame.getInstance(), () -> {
            for (Player player : Bukkit.getOnlinePlayers()) {
                Location loc = player.getLocation();
                TeleportPad matchedPad = null;
                boolean isForward = true;

                UUID uuid = player.getUniqueId();
                long now = System.currentTimeMillis();
                if (cooldowns.containsKey(uuid)) {
                    long cooldownEnd = cooldowns.get(uuid);
                    if (now < cooldownEnd) {
                        continue;
                    }
                }

                for (TeleportPad pad : pads) {
                    if (pad.isInsidePad(pad.from, loc)) {
                        matchedPad = pad;
                        isForward = true;
                        break;
                    } else if (pad.isInsidePad(pad.to, loc)) {
                        matchedPad = pad;
                        isForward = false;
                        break;
                    }
                }

                if (matchedPad != null) {
                    tickCounters.put(uuid, tickCounters.getOrDefault(uuid, 0) + 1);
                    if (tickCounters.get(uuid) >= 15) {
                        tickCounters.remove(uuid);
                        matchedPad.teleport(player, isForward);
                        cooldowns.put(uuid, now + 2000);
                    }
                } else {
                    tickCounters.remove(uuid);
                }
            }
        }, 1L, 1L);
    }

    private void teleport(Player player, boolean forward) {
        Location destination = forward ? to : from;
        player.teleport(destination);
        player.playSound(destination, Sound.ENDERMAN_TELEPORT, 1.0f, 1.0f);
        String msg = forward ? forwardMessage : backwardMessage;
        if (msg != null && !msg.isEmpty()) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
        }
    }

    private boolean isInsidePad(Location padLocation, Location playerLocation) {
        if (!padLocation.getWorld().equals(playerLocation.getWorld()))
            return false;
        double distance = padLocation.distance(playerLocation);
        return distance <= 0.5;
    }
}
