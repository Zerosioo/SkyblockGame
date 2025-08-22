package me.zero.skyblock.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.block.Action;
import org.bukkit.entity.Player;

import me.zero.skyblock.inventory.inventories.elections.FirstVoteGUI;
import me.zero.skyblock.inventory.inventories.elections.VoteChangeGUI;
import me.zero.skyblock.main.SkyblockGame;
import me.zero.skyblock.mayors.ElectionVoteManager;
import me.zero.skyblock.mayors.MayorElectionTiming;

public class ElectionJukeBox implements Listener {

    private static final Location JUKEBOX_LOCATION = new Location(Bukkit.getWorld("world"), 5, 33, -119);

    @EventHandler
    public void onJukeboxClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        
        if (event.getAction() != Action.RIGHT_CLICK_BLOCK) {
            return;
        }

        Block block = event.getClickedBlock();
        if (block == null || block.getType() != Material.JUKEBOX) {
            return;
        }
        
        if (!block.getWorld().getName().equalsIgnoreCase("world")) {
            return;
        }

        double y = block.getLocation().getY();
        if (y < 25 || y > 35) {
            return;
        }
        
        MayorElectionTiming met = new MayorElectionTiming(SkyblockGame.getPlugin(SkyblockGame.class));

        if (met.isElectionOpen()) {
            if (!ElectionVoteManager.hasVoted(player)) {
                new FirstVoteGUI().open(player);
            } else {
                new VoteChangeGUI().open(player);
            }
        } else {
            player.sendMessage("§cThe election booth is closed!");
        }
    }
}
