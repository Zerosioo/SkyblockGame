package me.zero.skyblock.listeners;

import me.zero.skyblock.main.SkyblockGame;
import me.zero.skyblock.user.User;
import me.zero.skyblock.ranks.PlayerRank;
import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.utils.PacketUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.event.player.*;
import org.bukkit.scoreboard.*;
import org.bukkit.event.*;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.entity.EntityPortalEnterEvent;

public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        User user = User.getUser(player.getUniqueId());
        user.load();
        user.booleanHandler.setBoolean("NONE", true); // to prevent none reg discovery message.

        // Initial rank and level prefix setup
        PlayerRank rank = user.rank;
        String colour = rank.getColour();
        String levelPrefix = user.LevelPrefix();

        String initialName = levelPrefix + " " + colour + player.getName();
        player.setDisplayName(initialName);
        player.setPlayerListName(initialName);

        // Register player on scoreboard
        Scoreboard scoreboard = Bukkit.getScoreboardManager().getMainScoreboard();
        Team team = scoreboard.getTeam(player.getName());
        if (team == null) {
            team = scoreboard.registerNewTeam(player.getName());
        }
        team.setPrefix(levelPrefix + " " + colour);
        team.addEntry(player.getName());
        player.setScoreboard(scoreboard);

        // Start a task to update display name every second (20 ticks)
        new BukkitRunnable() {
            String lastDisplayName = initialName;
            String lastPlayerListName = initialName;

            @Override
            public void run() {
                // Update rank and prefix in case they have changed
                String updatedColour = user.rank.getColour();
                String updatedLevelPrefix = user.LevelPrefix();
                String updatedDisplayName = updatedLevelPrefix + " " + updatedColour + player.getName();
                String updatedPlayerListName = updatedLevelPrefix + " " + updatedColour + player.getName();

                // Only update if the name has changed to avoid unnecessary updates
                if (!lastDisplayName.equals(updatedDisplayName)) {
                    player.setDisplayName(updatedDisplayName);
                    lastDisplayName = updatedDisplayName;
                }
                if (!lastPlayerListName.equals(updatedPlayerListName)) {
                    player.setPlayerListName(updatedPlayerListName);
                    lastPlayerListName = updatedPlayerListName;
                }

                // If the player logs out, cancel the task
                if (!player.isOnline()) {
                    cancel();
                }
            }
        }.runTaskTimer(SkyblockGame.getPlugin(SkyblockGame.class), 0L, 20L);  // Run every 20 ticks (1 second)
        
        SkyblockGame.getNpcRegistry().spawnAll(player);
        
        PacketUtils.inject(player);
        
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        User user = User.getUser(player.getUniqueId());
        user.save();

        // Clean up scoreboard when player quits
        Scoreboard scoreboard = Bukkit.getScoreboardManager().getMainScoreboard();
        Team team = scoreboard.getTeam(player.getName());
        if (team != null) {
            team.unregister();
        }
        
         SkyblockGame.getNpcRegistry().despawnAll(player);
    }

    // Handle player movement
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        User user = User.getUser(player.getUniqueId());

        // Ensure the player has loaded their user data
        if (user == null) {
            return;
        }

        // Check if the player's position has changed
        if (e.getFrom().getBlockX() != e.getTo().getBlockX() ||
            e.getFrom().getBlockY() != e.getTo().getBlockY() ||
            e.getFrom().getBlockZ() != e.getTo().getBlockZ()) {
            
            // Update the display name and player list name on move
            String updatedColour = user.rank.getColour();
            String updatedLevelPrefix = user.LevelPrefix();
            String updatedDisplayName = updatedLevelPrefix + " " + updatedColour + player.getName();
            String updatedPlayerListName = updatedLevelPrefix + " " + updatedColour + player.getName();

            player.setDisplayName(updatedDisplayName);
            player.setPlayerListName(updatedPlayerListName);
            ItemStack oakLog = new ItemStack(Material.LOG, 10, (short) 0);
        
    if (player.getInventory().containsAtLeast(oakLog, 10) && user.booleanHandler.getBoolean("timber_quest_collect_logs") == true) {
    	
    	user.booleanHandler.setBoolean("timber_quest_collect_logs", false);
    	player.sendMessage("");
    player.sendMessage(" §6§lOBJECTIVE COMPLETE");
    player.sendMessage(" §fCollect logs");;
    player.sendMessage(" ");
    player.sendMessage(" §6§lNEW OBJECTIVE");
    player.sendMessage(" §fTalk to the Lumberjack");
    player.sendMessage("");
    	
    }

            // Update scoreboard if necessary
            Scoreboard scoreboard = Bukkit.getScoreboardManager().getMainScoreboard();
            Team team = scoreboard.getTeam(player.getName());
            if (team != null) {
                team.setPrefix(updatedLevelPrefix + " " + updatedColour);
            } else {
                team = scoreboard.registerNewTeam(player.getName());
                team.setPrefix(updatedLevelPrefix + " " + updatedColour);
                team.addEntry(player.getName());
            }

            player.setScoreboard(scoreboard);
        }
        
        
    }
    
   @EventHandler
    public void event(EntityPortalEnterEvent e) {
        if (e.getEntity() instanceof Player) {
            Player player = (Player) e.getEntity();
            
            player.performCommand("hub");
        }
    }
       @EventHandler
        public void dropEvent(PlayerDropItemEvent e) {
        	
        	    if (e.getItemDrop().getItemStack().hasItemMeta() && (e.getItemDrop().getItemStack().getItemMeta().getDisplayName().equals("§aSkyblock Menu §7(Right Click)") || e.getItemDrop().getItemStack().getItemMeta().getDisplayName().equals("§8Quiver Arrow"))) {
            e.setCancelled(true);
            return;
        	
        }
    }
}
