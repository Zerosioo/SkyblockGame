package me.zero.mortar.npc;

import java.util.Collections;
import java.util.List;

public interface NPCMeta {
    String getName();
    int getId();
    String getSignature();
    String getTexture();
    String getDisplayName();
    default List<String> getHolograms() {
        return Collections.singletonList(getDisplayName());
    }
    String getWorldName();
    double getX();
    double getY();
    double getZ();
    float getYaw();
    float getPitch();
    boolean canLook();
    default NPCVoiceType getVoiceType() {
        return NPCVoiceType.MALE;
    }
}
