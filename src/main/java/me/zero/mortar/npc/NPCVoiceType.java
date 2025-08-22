package me.zero.mortar.npc;

import lombok.Getter;

public enum NPCVoiceType {
    MALE(1.0f),
    FEMALE(2.3f)
    ;

    @Getter
    private final float pitch;

    NPCVoiceType(float pitch) {
        this.pitch = pitch;
    }
    
    public final float getPitch() {
    	return pitch;
    }
}
