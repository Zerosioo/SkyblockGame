package me.zero.skyblock.npcs.removed;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import org.bukkit.ChatColor;
import java.util.Arrays;
public class Dante extends MortarNPC {
    public Dante() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "dante_mayor";
            }
            @Override
            public int getId() {
                return 100;
            }
            @Override
            public String getSignature() {
                return "vqcmYwa09B5eLkAFvALO2WrfGzSVJB8PBkayx6kBLBAmE6tCTqflvV2udPHMBXdX+HZxo7atxmEq+wO6K8bK4emGeu1XYRL2dzqrrP2H9pFZwyeCF+wkCkY44C1N9xGXUsM7PV4kUVnoZ607LhqTEkjpQHxhHbtz66ONPpdzO/pfflOSf8v/FK1SNbm6Vav6LuoPyCwpOzRXl1wD+cIruJ/GWhdtQsQol+84Fep/i8QWKgF19oJkK2ZGOCjFrGzAxgCrViSFMepCpSMEH/WnPTNxii1FVcE8kbFH14yZhwkWBbZ4q3XBSaDWBOiOHENPhKEEb9quKyQNsQ38KtIutO//g1j19e6J7GjRn4al7lCEO3D3x/LiD8c0EfDdbPmSwPccI/nY2FzZAJ3/0f7Epi/5sIzfI+cez/eLwIEv7juN0ajdE5nND5QINqJ4ZYo/HlSIGN8GZKzv1NOvtqE+O3q8csbae7GLzuG6jY4gkkW92Q0FiGWb296fcbQxyjzDRFgLK9RTHRMhQfz35NvCockfCBhFlXd9ERsQ/gIYUJ6HNx4WL1mbo9DFAPdi0aDHK6URlHLdm6tJraGNyiycxqJbB8vVV/Z6bk4SMg+5VXQHsIA3rhRnEtfbJvffKZkhH2zDvlsu2J/NKUBNoH0WI/xadEaMkB8qKx4cQPrPtaU=";
            }
            @Override
            public String getTexture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTYxNjg2OTA5MzI0NSwKICAicHJvZmlsZUlkIiA6ICI5MThhMDI5NTU5ZGQ0Y2U2YjE2ZjdhNWQ1M2VmYjQxMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJCZWV2ZWxvcGVyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzVhZjY1OGUwMGFjMGQwY2UwNjg2ZTc5ZjU5YzA2N2I5NTc3YzAxYmE1N2FkOGM2NTc1ZGI4NDkwYzMxNjE3NzIiCiAgICB9CiAgfQp9";
            }
            @Override
            public String getDisplayName() {
                return "Dante";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return 0.5D;
            }
            @Override
            public double getY() {
                return 0D;
            }
            @Override
            public double getZ() {
                return 0.5D;
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