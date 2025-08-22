package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RAW_SOULFLOW extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Raw Soulflow";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RAW_SOULFLOW"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5NTUyMjU0NTc5OCwKICAicHJvZmlsZUlkIiA6ICI5MWZlMTk2ODdjOTA0NjU2YWExZmMwNTk4NmRkM2ZlNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJoaGphYnJpcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84NGYwMjE0MzI5YmIyNTc1YjhmNGQ3NjIzMzc2MjU1ZDdlYzRhNDM5Mjk2ZTE0MGFlOWEyYzYxMzhhNDI3MGMxIgogICAgfQogIH0KfQ==";
    }

}
