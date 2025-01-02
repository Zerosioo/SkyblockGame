package me.zero.skyblock.main;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.world.WorldSaveEvent;
import org.bukkit.event.world.WorldUnloadEvent;

public class WorldSaveListener implements Listener {

    private static final String[] PROTECTED_WORLDS = {"world", "hub", "lobby"};

    @EventHandler
    public void onWorldSave(WorldSaveEvent event) {
        World world = event.getWorld();
        if (isProtectedWorld(world.getName())) {
            world.setAutoSave(false); // Disable auto-save to prevent saving the world
        }
    }

    @EventHandler
    public void onWorldUnload(WorldUnloadEvent event) {
        World world = event.getWorld();
        if (isProtectedWorld(world.getName())) {
            world.setAutoSave(false); // Ensure auto-save is still disabled when the world is unloaded
        }
    }

    /**
     * Checks if the world is protected from saving.
     *
     * @param worldName the world name to check
     * @return true if the world is protected, false otherwise
     */
    public static boolean isProtectedWorld(String worldName) {
        for (String protectedWorld : PROTECTED_WORLDS) {
            if (protectedWorld.equalsIgnoreCase(worldName)) {
                return true;
            }
        }
        return false;
    }
    
    
        @EventHandler
    public void onBlockBurn(BlockBurnEvent e) {
        e.setCancelled(true);
    }

    @EventHandler
    public void onWeatherChange(WeatherChangeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler
    public void onBlockGrow(BlockGrowEvent e) {
        e.setCancelled(true);
    }

    @EventHandler
    public void onBlockRedstone(BlockRedstoneEvent e) {
        e.setNewCurrent(0);
    }

    @EventHandler
    public void onBlockDecay(LeavesDecayEvent e) {
        e.setCancelled(true);
    }

    @EventHandler
    public void onBlockPhysics(BlockPhysicsEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        e.setCancelled(true);
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e) {
        e.setCancelled(true);
    }
    
        @EventHandler
    public void hungerEvent(FoodLevelChangeEvent e) {
        if (e.getFoodLevel() < 15) {
            if (e.getEntity() instanceof Player) {
                Player p = (Player) e.getEntity();
                p.setFoodLevel(20);
            }
        }
        e.setCancelled(true);
    }

}

