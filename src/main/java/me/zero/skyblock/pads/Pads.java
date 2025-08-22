package me.zero.skyblock.pads;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import me.zero.skyblock.util.HologramUtil;

public class Pads {

	public static void register() {
		
		// Election Room 
		new TeleportPad(
            new Location(Bukkit.getWorld("world"), 4.5, 72, -115.5, 0f, 0f),
            new Location(Bukkit.getWorld("world"), 5.5, 33, -106.5, 180f, 0f),
            "§dWarped to Election Room!",
            "§dWarped to Community Centre!"
        );
        
        Location el = new Location(Bukkit.getWorld("world"), 4.5, 72, -116);
        Location cl = new Location(Bukkit.getWorld("world"), 5.5, 33, -106);
        
        // Election Room Holograms
        HologramUtil.createHologram(el, "§d✧ Election Room Warp");
        HologramUtil.createHologram(cl, "§d✧ Community Centre Warp");
	}
}