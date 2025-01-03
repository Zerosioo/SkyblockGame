package me.zero.skyblock.npcs.park;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import org.bukkit.ChatColor;
import java.util.Arrays;
public class Ryan extends MortarNPC {
    public Ryan() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "Ryan";
            }
            @Override
            public int getId() {
                return 109;
            }
            @Override
            public String getSignature() {
                return "oq6Znj5QHd/YdOCAnjB7slFgnE4fdoWIf1Phyw9DGgYtPrP3gPtaBjSxL3QdnkTc+MjNPLmmyPj8IIj/nOGkoRq7kEK4I3rR6CUmuLalic4ylNBS95RF6q63sm+bYk/AX4H0Om1yGGXIDthPWodzEUYQjXT5N7h3eHPiQvJmTab8X3UOY9g6OM8NbBSwlHoy1mDkSfkFPky74lJgZW2mUE0+XKg2BSP6s4Gb1rRntCDuGFyyyWcaFBLfoCetyLty7TSJgBMvf4c22ImFQ/eqmB1L7vV7TR4qC+Fkpz9HCd46fvWs1YtlYL2gNvBwRwy30iB7+mhUfb0L+0VQgYcFH2WLlZKVg4gXZsE2rKSrtFmcsU0JGlg8NXOYB/m3hQYb/CCqem7SOHgx3BB3W6vfGvf+mVS/fEsXx6kdCCSar8S37XTXtFr1Cr5KMb04RBxsryl06ZN0bPwTHnauBglXK92wpxF97b4w5m1Pm8KZTO69K9QaILxTz8MIcItXCHSPv7zse8iD3D2EB2XRHYW8HvsU+Ua5XZNHCWAv59dcmqoMA+y+XhCvbvcipOEr4+Cag1wc7i5PkUJ7is8GHaBX79fFdY7Mn/tdIlp3P/e3jSjq36ygTDBVUTfNci2UFLqMrsLfngr01IVb39bxg2SlDQfdXN1o5nTBAJrPIs/obpE=";
            }
            @Override
            public String getTexture() {
                return "eyJ0aW1lc3RhbXAiOjE1NjI1OTQ0NTU1MTAsInByb2ZpbGVJZCI6IjgyYzYwNmM1YzY1MjRiNzk4YjkxYTEyZDNhNjE2OTc3IiwicHJvZmlsZU5hbWUiOiJOb3ROb3RvcmlvdXNOZW1vIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81MTc2Y2IxM2E0NDM2MzE4YWU0YzJiYzMxZGYwOWQ1NTYxOTJkYWViYjcwYTNiMjgwMjBmN2FiOWNhMTcwOWJiIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=";
            }
            @Override
            public String getDisplayName() {
                return "Ryan";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return -330.5D;
            }
            @Override
            public double getY() {
                return 103D;
            }
            @Override
            public double getZ() {
                return -103.5D;
            }
            @Override
            public float getYaw() {
                return -89.8F;
            }
            @Override
            public float getPitch() {
                return 0.2F;
            }
            @Override
            public boolean canLook() {
                return true;
            }
        });
    }
    @Override
    public void onInteract(NPCInteractionEvent event) {

     
    }
}