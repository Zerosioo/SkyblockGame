package me.zero.skyblock.location;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.zero.skyblock.user.User;
import me.zero.skyblock.sounds.Sounds;

import java.util.HashMap;
import java.util.Map;

public class LocationManager {

    private final Map<Player, SkyblockLocation> playerLocations = new HashMap<>();

    public void updatePlayerLocation(Player player, User user) {
        int x = player.getLocation().getBlockX();
        int y = player.getLocation().getBlockY();
        int z = player.getLocation().getBlockZ();

        SkyblockLocation newLocation = SkyblockLocation.getLocation(x, y, z);
        SkyblockLocation currentLocation = playerLocations.getOrDefault(player, SkyblockLocation.NONE);

        if (currentLocation != newLocation) {
            playerLocations.put(player, newLocation);
            onLocationChange(player, user, currentLocation, newLocation);
        }
    }

    private void onLocationChange(Player player, User user, SkyblockLocation oldLocation, SkyblockLocation newLocation) {
        String locationId = newLocation.name();

        if (user.booleanHandler.getBoolean(locationId) == false) {
            user.booleanHandler.setBoolean(locationId, true);
            
            String title = newLocation.getName();
            String subtitle = "§6§lNew Zone Discovered!";

            player.sendTitle(title, subtitle);
            Sounds.NEW_ZONE.play(player);
            player.sendMessage("");
            player.sendMessage(" §6§lNEW AREA DISCOVERED!");
            player.sendMessage("§7  ⏣ " + newLocation.getName().toUpperCase());
            player.sendMessage("");
            
            
         if (getPlayerLocation(player) == SkyblockLocation.VILLAGE) {
                locationMessage(player, "Explore the area to learn more about §bSkyBlock§f.");
                locationMessage(player, "Visit the §6Auction House§f.");
                locationMessage(player, "Manage your §6coins §fin the §6Bank§f.");
                locationMessage(player, "Enchant items in the §bLibrary§f.");
                player.sendMessage("");
            }
            
       if (getPlayerLocation(player) == SkyblockLocation.BIRCH_PARK) {
        locationMessage(player, "Talk to Charlie.");
        locationMessage(player, "Chop down Birch logs.");
        player.sendMessage("");
       }
     } 
    }
    
    public String getCurrentLocationName(Player player) {
        SkyblockLocation currentLocation = playerLocations.get(player);
        return currentLocation.getName();
    }
    
    public SkyblockLocation getPlayerLocation(Player player) {
        return playerLocations.getOrDefault(player, SkyblockLocation.NONE);
    }
    
    
    public void locationMessage(Player player, String message) {
    player.sendMessage("§7   ◻️ §f" + message);
    }
}
