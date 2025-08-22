package me.zero.mortar.npc;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class NPCInteractionEvent extends Event implements Cancellable {
    private static final HandlerList HANDLER_LIST = new HandlerList();

    private MortarNPC npc;
    private NPCActionType action;
    private int entityId;
    private Player player;
    private boolean cancelled;

    public NPCInteractionEvent(MortarNPC npc, NPCActionType action, int entityId, Player player) {
        this.npc = npc;
        this.action = action;
        this.entityId = entityId;
        this.player = player;
        this.cancelled = false;
    }

    public MortarNPC getNpc() {
        return npc;
    }

    public NPCActionType getAction() {
        return action;
    }

    public int getEntityId() {
        return entityId;
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
