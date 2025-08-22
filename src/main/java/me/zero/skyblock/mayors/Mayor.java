package me.zero.skyblock.mayors;

import me.zero.mortar.npc.MortarNPC;
import java.util.List;

public interface Mayor {

    List<Perk> getPerks();

    default String getFormattedPerks() {
        StringBuilder builder = new StringBuilder();
        for (Perk perk : getPerks()) {
            builder.append(perk.getTitle()).append("\n");
            for (String desc : perk.getDescription()) {
                builder.append(desc).append("\n");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    default String getId() {
        return this.getClass().getSimpleName().toLowerCase();
    }

    MortarNPC createNPC();

    void onActive();
}
