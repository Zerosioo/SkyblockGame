package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SHENS_REGALIA extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Shen's Regalia";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SHENS_REGALIA"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1ODg3MTEwMDgzMywKICAicHJvZmlsZUlkIiA6ICI4YmM3MjdlYThjZjA0YWUzYTI4MDVhY2YzNjRjMmQyNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJub3RpbnZlbnRpdmUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWM3ZmI2ZjQxNGZmMGViNmJmNTc5N2FjYjNiM2FmMzU0Y2EzYWY5NWNlYjhmMzQxODEyNWY2YjgwNTQxOWYzOSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
