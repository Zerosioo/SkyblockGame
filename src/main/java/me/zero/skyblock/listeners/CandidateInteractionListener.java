package me.zero.skyblock.listeners;

import me.zero.mortar.MortarLibrary;
import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCActionType;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.skyblock.mayors.MayorManager;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import java.util.Optional;

public class CandidateInteractionListener implements Listener {

    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
        Entity clickedEntity = event.getRightClicked();
        Player player = event.getPlayer();

        // Check if the clicked entity matches any SPAWNED_NPCS entity ID
        for (MortarNPC npc : MayorManager.getSpawnedNPCs()) {
            if (npc.getEntityId() == clickedEntity.getEntityId()) {
                npc.onInteract(new NPCInteractionEvent(npc, NPCActionType.CLICK_NPC, npc.getEntityId(), player));
                event.setCancelled(true); 
                return;
            }
        }
    }
}
