package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CRUX_TALISMAN_4 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Crux Relic";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CRUX_TALISMAN_4"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4NDM1MzQyNTM2OSwKICAicHJvZmlsZUlkIiA6ICI1ZTg2ZTc3OGQ0NTc0N2NjYjQ4N2E1OWRlZDMzZDRlMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJQbGVpc18iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWRhYjJmZjlmMmI1ZTJkMzY5MjIyNmY2MzhlYjllNjc2NGE0NWI0M2JhMDI3OGM1ZTBiZDhkNzQ5NDJjNTcyZCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
