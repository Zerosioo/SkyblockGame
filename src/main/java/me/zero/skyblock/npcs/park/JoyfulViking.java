package me.zero.skyblock.npcs.park;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import org.bukkit.ChatColor;
import java.util.Arrays;
public class JoyfulViking extends MortarNPC {
    public JoyfulViking() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "JoyfulViking";
            }
            @Override
            public int getId() {
                return 105;
            }
            @Override
            public String getSignature() {
                return "KjVjsxnZFWNo8Mpbizwg4gRz75j76Cjnx9AnAcJH9qjUy/+TcYNFjZBin0IAX+m4Rj2bihIprrk6LZZwXIXvYRW5tWDURhCmrCIqmajercwiug6bGqn6YqIU5T8b2l/Qv2xchogUFM3ipfY7fMsaEZqLUThVehONM83txsg5gxKoiwKafdsOjZOgmKqnKPygUxRPTwCHrGSbu0d9MhDvqkm7hSjvmStqCNeKAf4XN52Z3GYO50x8HNAq9ajZiY//KowvKVmWb4g857ckiqyhwmPYpQU/IQ2e7HA4iv69GtweFMoOKULPvZTFORjjb9rENuHFW7r/1OnuTXYbBpqx6FdsQPs5orT9xR4n4sJTjVMvUn3aJNJnbmPokxAhhWPd4nk+uZuvbsqssq4wIwgTRC3n0MTXHI0rOw2Ri/y0/TClY1L3ZD1jdUUM61A3Pf/e4LLQHwIc+ypaZBM9RE+/tcla/+eDvm8LVJWq8H//hcMmZdZ4rGvU81MOcxZJTwPDyf8PtuxWqOvGSDSdPwaBwoLFpdvwoFh/128eQqLPHbzizDfjCuASe+Y1jtzcU3cIqAU6/pktA/sbO0zMxvQV1m08jCVyCd8uVsbUXBu8XrRCqxa3CD8AGxOtYGPDSD06GFfRo0mp99ROk2n+mZp/xRJtuWHDA/BVhPjofmzSvms=";
            }
            @Override
            public String getTexture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTYxMjk2NzIwMDY3OCwKICAicHJvZmlsZUlkIiA6ICI5OTdjZjFlMmY1NGQ0YzEyOWY2ZjU5ZTVlNjU1YjZmNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJpbzEyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2NkNTEwNDNkNmExOGZjMDE0ZjI2NGIxZTdkN2ZjMTgzM2FmYThjZjZjYTI5ZjJiOGY2OTFmZGY1NGRhZmVmZGEiCiAgICB9CiAgfQp9";
            }
            @Override
            public String getDisplayName() {
                return "Joyful Viking";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return -359.5D;
            }
            @Override
            public double getY() {
                return 91D;
            }
            @Override
            public double getZ() {
                return 76.5D;
            }
            @Override
            public float getYaw() {
                return -76.8F;
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