package me.zero.skyblock.sounds;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class SBSound {
    public SBSound(Sound sound, int delay, float vol, float pitch) {
        this.sound = sound;
        this.delay = delay;
        this.vol = vol;
        this.pitch = pitch;
    }

    public Sound sound;
    public int delay;
    public float vol;
    public float pitch;

    public void play(Player player) {
        player.playSound(player.getLocation(), sound, vol, pitch);
    }

    public void play(Location loc) {
        loc.getWorld().playSound(loc, sound, vol, pitch);
    }
}