package me.zero.mortar.npc;

import lombok.Getter;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class NPCInteractionEvent extends Event implements Cancellable {
    private static final HandlerList HANDLER_LIST = new HandlerList();

    @Getter
    private MortarNPC npc;
    @Getter
    private NPCActionType action;
    private int entityId;
    @Getter
    private Player player;
    private boolean canceled;


    public NPCInteractionEvent(MortarNPC npc, NPCActionType action, int entityId, Player player) {
        this.npc = npc;
        this.action = action;
        this.entityId = entityId;
        this.player = player;
    }

    @Override
    public boolean isCancelled() {
        return canceled;
    }

    @Override
    public void setCancelled(boolean b) {
        canceled = b;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }
}
