package me.zero.skyblock.location;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import me.zero.skyblock.user.User;

public class LocationListener implements Listener {

    private final LocationManager locationManager;

    public LocationListener(LocationManager locationManager) {
        this.locationManager = locationManager;
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();

        if (event.getFrom().getBlockX() != event.getTo().getBlockX() ||
            event.getFrom().getBlockY() != event.getTo().getBlockY() ||
            event.getFrom().getBlockZ() != event.getTo().getBlockZ()) {

            User user = User.getUser(player.getUniqueId());
            locationManager.updatePlayerLocation(player, user);

            
        }
    }
}
