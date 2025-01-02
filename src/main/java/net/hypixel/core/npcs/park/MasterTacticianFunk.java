package me.zero.skyblock.npcs.park;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import org.bukkit.ChatColor;
import java.util.Arrays;
public class MasterTacticianFunk extends MortarNPC {
    public MasterTacticianFunk() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "MasterTacticianFunk";
            }
            @Override
            public int getId() {
                return 104;
            }
            @Override
            public String getSignature() {
                return "TIzDXFaV8d27TS5NcSAccjaGxb3desOvxAgi+/TX2IqadXdtjWJgo1QS1ExLKZWTagsCTl6OT8Hz5sGlGhBnFw3sEJQb3aa6wOxZ+zMFILGmQTPJ3QELOMys7FEvlcW1KhzBRf65Y2trMD2vi4DVFo/uOBpsIs+T0KnI4CGvS75WHFQImMhF7nBnAFx7gyxCqipRgvbEh05cnLbuS862UWzMjpqbdJ6k/yPrfTHLj7QvIvnfC0Rbll6Gx3OxbiLOo289TfVeD+QYj9qbarmGZJqYp7tUk4G91lsrh/kMIEW9811Slm9BUjt99YZPkrbaR/lkpmwusbj2umQC0R4Er5CQEwXBL/8XHWNAB+yx1dKeH7MMLJ0D2eP5MWe1R5xI+9JBVyauNi/w3F5brouEHGW2BK+4HRfNPloSlmxlFIVnCfuBmmZG5RTI9k8k3q8u0VsVqy3de5z49eh/mzyJO1l717YxwdL0a89vcL8D/1WBbXa8CdWCemdWstD3/Ex6bRuCDWHKqI/TZ3qxMvFb1B/rhy7HrJyHrqNH60rdEoXkqyMojZl6v8QQzGvMFYMwQlRf4VUxPPsDhi9KruJcZF2lX9evbznkTW3EEsCNsV+cYJyWJK0X9Bl16uTLNq5k58qhOOHwhkBMHv/BW5mTLyRlFCCVvWbT0lJNncFUrsU=";
            }
            @Override
            public String getTexture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTYyMzQzMDQ3MjEwNCwKICAicHJvZmlsZUlkIiA6ICJmOTJiZDcxNGE0NmE0MmQ0OTQ1ZjdiMGNmNzExMDllNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJzaGlrb2xpbmsiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTJiN2FjYmZhOTMwOGEyMmU3NTA2YTM2YmNjYWZkMDE2MGFmYTBkNTAwODE4ZWZlZTlmYTk4MzUyMTRjMTRmYSIKICAgIH0KICB9Cn0=";
            }
            @Override
            public String getDisplayName() {
                return "Master Tactician Funk";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return -462.5D;
            }
            @Override
            public double getY() {
                return 110D;
            }
            @Override
            public double getZ() {
                return -15.5D;
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