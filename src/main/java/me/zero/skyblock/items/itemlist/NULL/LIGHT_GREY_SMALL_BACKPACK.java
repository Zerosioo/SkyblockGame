package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LIGHT_GREY_SMALL_BACKPACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Small Backpack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LIGHT_GREY_SMALL_BACKPACK"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTUzODM2ODgzMywKICAicHJvZmlsZUlkIiA6ICI5NTQ1NGYzOTkwNGE0MDg0OTcxMTQ0Y2Q5MmRhY2MyYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJHcDA4MTAiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDE2OTlmYTRhMTUxOTY5Njg3MDUzOWY1ZTU0ZjU0ODM3MmZiYjM0Y2UwNGM4ZWU0ZWZiOGNlN2YyOTQ5MWI1NiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
