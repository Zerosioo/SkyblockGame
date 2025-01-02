package me.zero.skyblock.npcs.park;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import org.bukkit.ChatColor;
import java.util.Arrays;
public class Romero extends MortarNPC {
    public Romero() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "Romero";
            }
            @Override
            public int getId() {
                return 108;
            }
            @Override
            public String getSignature() {
                return "OmO0rD+JB04rTH5c8NFN0Cvr9Oikp+/hiqFcReAnkI34zUKkZMHKQSVWQvKk0Elf2aVYYQ2rTj5spPhl8OUrfPr0MI+5bhCgtq2o2zJjJhzwKqOvClMEvD/f0fjeg1IcFa8hTcc+yVCNiqveq7xQJVFYkL2+BOk98RM0FdfHlxz4Z4goMF7+BLmY9UHLdclorPzcOpwm5xyhWllSqmw4XD/31pDyaauWwFvw7uBog8ct9KM/+f3lU1Ug9gZRUu1mXEZHJVORwwuwY3J8qr+8vVepgRcZ3SE5O5ObT0KaUC3Zw2hrYG/0GtR3+x7BOzRKeEnIPW6ngdL4UL/Q99gFbzfqyDN2XLsYfgvYRGTsL13sGzu23hs6Z8nIaEW9KQP5ApB2kVGcLv7GAlqEj8D6Xm3P+L6+BNQpiyl+FaEPKHIMyUTfTbRJIKX9HXtJ/nCKZEi34T3kuu0oC3Um8lvrca79FkNQqtLrBUHzg25bsjCtIDbotyO+BIMG+ms3gVXuyiGQ4YW3VgtZPo3WI7/IV2R4Y9XoaLWIc3PxzGiHr4EfTMOgDhEBYkiJqwpqacYMoyXGCLG04bs08GlohOEDMgCFq7UrprWlNhqNFgFA6Y5z+dughgzswp5aj64x8xmuaihBvDoPyr9cskWg+D8G3yiQVVupZo5pG94RAkh9IBE=";
            }
            @Override
            public String getTexture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTYyODc4MDA5NTk5MCwKICAicHJvZmlsZUlkIiA6ICIxYWZhZjc2NWI1ZGY0NjA3YmY3ZjY1ZGYzYWIwODhhOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJMb3lfQmxvb2RBbmdlbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iMzM1MWYyMmY2M2I0M2Y0MGZhOGUyOGRlZjY2YjczYjE3YmEyNjU3NzNmZTk5ODA5NzFkYTJmMTUxNTAzMmQ5IgogICAgfQogIH0KfQ==";
            }
            @Override
            public String getDisplayName() {
                return "Romero";
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