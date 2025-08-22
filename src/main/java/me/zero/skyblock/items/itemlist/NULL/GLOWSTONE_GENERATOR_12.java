package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GLOWSTONE_GENERATOR_12 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Glowstone Minion XII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GLOWSTONE_GENERATOR_12"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SKULL_ITEM;
    }

    @Override
    public byte getDurability() {
        return 3;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzODk3Mzk3NTAyOCwKICAicHJvZmlsZUlkIiA6ICIxYWZhZjc2NWI1ZGY0NjA3YmY3ZjY1ZGYzYWIwODhhOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJMb3lfQmxvb2RBbmdlbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85MTcwMWFhNjhhMmQxNDFmZTBhODViYTQ4MjViNjc0NjJkZTRkMmNiY2NkOGI1MmVmMDE4ZDM5ZTM3Mjk2ZWUyIgogICAgfQogIH0KfQ==";
    }

}
