package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FINE_FLOUR extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Fine Flour";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FINE_FLOUR"; 
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
    public int getPrice() {
        return 500;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA1MjU5MzQ4NiwKICAicHJvZmlsZUlkIiA6ICJiN2I4ZTlhZjEwZGE0NjFmOTY2YTQxM2RmOWJiM2U4OCIsCiAgInByb2ZpbGVOYW1lIiA6ICJBbmFiYW5hbmFZZzciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjFlNTFhOWJlNGQxNzlhZWI1NDlmNGVjYjhhNmM0M2E1OTRjZWIxNWJmM2IyZGI1MzE3ZWFiNzgwMTBmMzIxMCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
