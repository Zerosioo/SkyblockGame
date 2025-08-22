package me.zero.skyblock.items.itemlist.BELT;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLDEN_BELT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Golden Belt";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOLDEN_BELT"; 
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
        return ItemType.BELT;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczMjEzNjgxMjE5MiwKICAicHJvZmlsZUlkIiA6ICI5YjhhN2NlMmJlYjI0NjdkYTJjZmU4MzQ1YTNjOTZkOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTdGFyR2FtZXJTaGFsb20iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWNlYjg3NGE1YWE5YWFiNWI5ZTA5Zjc5Zjc5ZTU5N2YzMjBhYWMzNmY0MmQ3ZmYwNzRhNmM2MjliNzY4OWY5MSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
