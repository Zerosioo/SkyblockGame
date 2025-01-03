package me.zero.skyblock.npcs.hub;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import me.zero.skyblock.util.SUtil;

import java.util.Arrays;
import java.util.List;

public class SecuritySloth extends MortarNPC {

    public SecuritySloth() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "security";
            }

            @Override
            public int getId() {
                return 6893730;
            }

            @Override
            public String getSignature() {
                return "ESu1W+i5foGb/+/4hIcVR7ArPgTMZBO2PGjAagT+2jRYbWs0ZZN/5Hs8KxEiBxpU7zaJh1gpt0j9IX0Ckrj/Cii9zoLS03PcoSXjnrdQG/ZkuONoj/2KRddy9Yu17sY2DXYmm9AkjkbnhOT10qwAFMxP6xMHgtVU+Tr/DIXEGrH4GucXkaSUo1irEbflzbA2xxKSSbc0P1fmebWtEitcPDG8SkWYONNkajH/v6X8bChe7udlb+6ECGiNbvegeWhHW+2e7YWzoqV+dg0a3BgvF/NFsWmO8/2imBk/illPo6QQQg2RiwlvH1+/0zCU++tSDucV4B8GrWU/MPe2tA6ZAxEb0uaV0Nm6DCpSL6hm2spvZNt+xkpvD0E3Qv0oENUcw0iEuArhzeO7zCplwZ3d8ce1VnSWEIhHI+JYW+wivnra6CCcnIyUQX5t5U8dDIxIGTLCB4J+JMO7JjArN+3jyywLF/s0/x4QCRfETuyMhzyS6bY7WNxX1XSg1/soMTcp+1p5p5kvyoRyGG9tnoGSdWtYXF0b9I3cjZqruzkZpHHP88PZN6IQrs4C300CrqBPdOAqY53Cu30a493lL0EhliYdoJGwOCGzes8arbAWuqdoC4GthaPB/pj6XRfjbelPtVuw0a9aJzFCDsUlUYskDoNXXuFfxv/knCRuDFKUYsI=";
            }

            @Override
            public String getTexture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTY1MjkwNzI5ODg4MywKICAicHJvZmlsZUlkIiA6ICIwNDNkZWIzOGIyNjE0MTg1YTIzYzU4ZmI2YTc5ZWZkYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJWaXRhbFNpZ256MiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iNjI5OGRlZDZhOGM5ZTZjZGZiNWRiMGU1NGViMzUyOWY4YjA4ZmUwYjA3MDliMTA0NzFmZjQ2N2VmZjg0NjYxIgogICAgfQogIH0KfQ==";
            }

            @Override
            public String getDisplayName() {
                return "§cSecurity Sloth";
            }

            @Override
            public String getWorldName() {
                return "world";
            }

            @Override
            public List<String> getHolograms() {
                return Arrays.asList(
                        "§a§lSTAY SAFE!",
                        "§cSecurity Sloth"
                );
            }

            @Override
            public double getX() {
                return 2.0D;
            }

            @Override
            public double getY() {
                return 70.0D;
            }

            @Override
            public double getZ() {
                return -76.0D;
            }

            @Override
            public float getYaw() {
                return 0.3F;
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
        
        speak(event.getPlayer(), Arrays.asList(
                "§fDownloading suspicious mods or visiting untrusted discord servers can put your account at risk. It is up to you to keep your account secure!",
                "§fDon't give your ID and password to anybody! §aStay Safe§f!"
        ));
        
    }

}
