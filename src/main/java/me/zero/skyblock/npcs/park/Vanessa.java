package me.zero.skyblock.npcs.park;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.*;
import org.bukkit.ChatColor;
import java.util.Arrays;
import me.zero.skyblock.inventory.GUI;
import me.zero.skyblock.inventory.inventories.npcmenus.VanessaGUI;
import me.zero.skyblock.inventory.inventories.MysteryVaultGUI;
import me.zero.skyblock.util.SUtil;

public class Vanessa extends MortarNPC {
    public Vanessa() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "Vanessa";
            }
            @Override
            public int getId() {
                return 110;
            }
            @Override
            public String getSignature() {
                return "kiHrwbcAQiF1i3e1Ikvv42z7TGC7RhNRh7nDQresMZghkbzYDGOXJSugjOU41vjSvSGDRzLqEPEl8odpPbsKLU0Rq3I/k1MjxvTExBOV0Qq2tzkjfpkM4zqz9b5tO+41YiAe/pPOswIiTsVQz/IUijDV257SF8691ObwwHSew+ZlzbSBGK+1FpFGA99k73HZQzsxKD0doo4cmVhzv3eEzS/u49dBS0acxD2mReWnt/GJDltYPvYhKwbg9O3sYBYha7onA7ys4L41hJrZ9m8n9d8ZRo0gkgTKJLEZfErZn4QG3WTVDjgHNiqG7cAN7loUdBtRLM+GPnI7jFBdzwLxU8DdRU6/lySU44bRjjiAHyDn9jO0h5a9forWwmrzd1TtrYqlinY51GfITB6f2gO1hEtWw3K32dhCD4picHVW+Vc41n1XrvXEDOQf8RVzrmumBNfa29ybCp7WeIphvXuLZIfEMCqq6Hv3d057zP3SH4cRTyzlm4ZCVRFZG4HgsKNYaF66oD12dWKf2AoKJBwAgkBpBV+FJS0SYhQ2WnyNcRYi4XVXw7gV2RWEauhZRMPovYiLxXmsaYp834ShO2DlFrRWQBi+fR0zUsxbCRvi1BVBl6auqF+oPZGpNif3r0j90WTXws/Tt31MGuUrHMAa1TOE9oEQSlwXr863InQRHUE=";
            }
            @Override
            public String getTexture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTczNTQ3NDc5MjExMywKICAicHJvZmlsZUlkIiA6ICJhNTdmZDE5MGZmM2U0YjBkYTEzMmY2OGUzOTU3ZjViMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ4Y2VwdGlvbl9udWxsIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ5ZTI5NzljOGUyYzU4ODk4YzI3NzRiMzY2OWVhNGExYjI5NzY3ZmNkYzJkZDU5MzdlYzBjZjBkYTNhOGZiNjciCiAgICB9CiAgfQp9";
            }
            @Override
            public String getDisplayName() {
                return "Vanessa";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return -311.5D;
            }
            @Override
            public double getY() {
                return 83D;
            }
            @Override
            public double getZ() {
                return -70.5D;
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
            
            @Override
            public NPCVoiceType getVoiceType() {
        return NPCVoiceType.FEMALE;
    }
            
        });
    }
    @Override
    public void onInteract(NPCInteractionEvent event) {
        
        speak(event.getPlayer(), Arrays.asList(
                "I have the power to conjure §brain §ffrom the skies.",
                "But it'll cost you!"
                
        ));
        
        SUtil.delay(() -> new VanessaGUI().open(event.getPlayer()), 60);
     
    }
}