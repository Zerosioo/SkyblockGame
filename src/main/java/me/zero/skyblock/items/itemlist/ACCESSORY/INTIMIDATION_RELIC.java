package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INTIMIDATION_RELIC extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Intimidation Relic";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "INTIMIDATION_RELIC"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5Njk1Nzc4NDgwMiwKICAicHJvZmlsZUlkIiA6ICJmNjk2OWMxYzBmY2Q0YTZiYWY1OTllNjQ2ZWM3M2VjOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJQb3dlckRyYWdvbkhlcm8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzA2NmZkMDc2ODM5ODllNjZiZjc1MjM5OGM0ODYxYzcxYWU2ZmUyMjhhNDkzZjJmZGY0MjczODE2NTBhMTI4MCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
