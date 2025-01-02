package me.zero.skyblock.npcs.hub;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import java.util.Arrays;
public class Bea extends MortarNPC {
    public Bea() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "bea";
            }
            @Override
            public int getId() {
                return 2;
            }
            @Override
            public String getSignature() {
                return "jGogW2qrpy0uQqJR1Q6src6iR/mYq8o41ybgiIFPOnvUVUk4NumSftCavPfdeHkk1B4COP0vB6+6hAXba+MoJMM/dwYYNQHFm/lGYcO0cFS2axbWxiC8DefGCIV5qHKgBdBeFbA+MpdWEkK7xUIUQbdpBD2v3GafC2XX+JPuUKuubLkyRbPNhmaZ9NXLnEnjMI/aKupIAmWR3LsGEO9IcAH/Yxb43ZZavnVh1IVl2wqlsPR+aC7+t3ScbajcCMwZPzP9HFyuNDzcY8xta9zS8auSoIvZnab+lm3HA3CrZfVxYaO9nomafMtc1t6S5ljC18BZRu2sepLL1yewyTUYsbmTuYkmErCB29XXuLe/5e9k7K8ID8LyE7XXWB7l7eYiX6XF9znZxd3OIuvbt4Kin1lNBlQNXSY8GXk9Dj009YKCEEVrw4FquGUkicujlNORcYWc/8Aoy1nxR1wyCNOVDQiqasiOSyeM5DzQ1lRQC4QfE3279r5qRJf3njKNMG0yg4J294ohpazCRjXFKTTV7FVhF+PlaZybA//2GFiND0fnFl8iKp3fBPdtaBZNr0HHRxQsnkHrQox7J8zDS8tvslZ1RlkiQW5JQvPKILEeX8NipglG63R65Y1cVzbwQG3h2QigZgt1BoOcK4PU7LgpfdLWh8UjKDBaJVmFHAoqk2w=";
            }
            @Override
            public String getTexture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTYxMzMwNzkzMDU0MSwKICAicHJvZmlsZUlkIiA6ICJkODAwZDI4MDlmNTE0ZjkxODk4YTU4MWYzODE0Yzc5OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ0aGVCTFJ4eCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lM2MzNGI5ZTUxZjM1MmQ2YzY5YzgyMWExZmMyOWY1MDA1MDk4MDNhMWVlYzAyNGMzODcwMTViNWM0M2M3NzNhIgogICAgfQogIH0KfQ==";
            }
            @Override
            public String getDisplayName() {
                return "Bea";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return 31.5D;
            }
            @Override
            public double getY() {
                return 70D;
            }
            @Override
            public double getZ() {
                return -94.5D;
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