package me.zero.skyblock.npcs.park;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import org.bukkit.ChatColor;
import java.util.Arrays;
public class Juliette extends MortarNPC {
    public Juliette() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "Juliette";
            }
            @Override
            public int getId() {
                return 103;
            }
            @Override
            public String getSignature() {
                return "JcLoZj0nfZA5FlKmiKoGc54TfrGm5WLF0cUx/RfuL4kMCHEvSV58+fYFA6UYH7jBtrls8fJUUAMJPW1tdJr/VYOpwe3s/j9ETX+7vlU1+VEo88E8Ydy8lqigls8bu57g2Yu8RERtRgbx/aOe4ocgfY43x5WgceL978FW+z+VAI3BdyIeITTShfacESyrqhF9X8GPcomaRTX07NfDC6dwwdBE/G14Yp6SglNbQd6HHX8jgqxHweMJSdWeqI3Wr3v4aYamOzwWlVO7HmIR/mVFNQ7nRGXQoVL86ei9H+553gsah2UXSlatwCeQE2vJqY+WFwVBIUy3GS58wlCdSsqExIv3Uzxk/F9Rt4P4/GQ04tT1xlw5xWbaPeeJPMEse9X6WcukCU05iqDFO5cD765Q+bcwELqvNaVIpIcdcCZosbcJMYjcqitfO1m7Up6V5WTyeT9cs41/njc8x8qQ9RqF1FqUy5nGcmRgBxBdcu2/l/pey8oViUwvJzPyBkYdr6+cqIvoq+MSkPEDRKkTqTNXmBMdRU0fIg+NfOr4PsiqyIWc9qsb0Bi53jQXzGSvSJVlcEHSDX5AQD6K0/0hFetiPeLvRPwv5UX6nrK5D1xlc4cuV1foyNjE6FLRhf/1x0UIEeZlrzJ3J9/pDDiZZJyCr/M1qqtAo4jg67/G+xn7J3Q=";
            }
            @Override
            public String getTexture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTczNTQ3MTUyMzkwMiwKICAicHJvZmlsZUlkIiA6ICI4ZDYwNGY0NWM0OWQ0YWE2Yjc0MjhiNTJlYzcyYjliNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTdGFyRG9ubiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82MjFhYWJlZDNiYThiODhiOGRlMzQzYjI2N2JjNDliMmRmMDQ2OGMwYmE0ZjIwZmViOTg1MmI3NGMyMmYzMDIwIgogICAgfQogIH0KfQ==";
            }
            @Override
            public String getDisplayName() {
                return "Juliette";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return -476.5D;
            }
            @Override
            public double getY() {
                return 134D;
            }
            @Override
            public double getZ() {
                return -115.5D;
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