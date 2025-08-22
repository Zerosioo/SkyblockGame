package me.zero.skyblock.items.itemlist.FISHING_ROD_PART;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ICY_SINKER extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Icy Sinker";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ICY_SINKER"; 
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
        return ItemType.FISHING_ROD_PART;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 10000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczOTg4ODYwNzczNCwKICAicHJvZmlsZUlkIiA6ICJiNjZiYTQ5ZWFiZWM0YmY5OWVhOWY5NDBjMTcxYTkzMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYXRlaUxpa2VzTWluaW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDFkZmIxODYxYWEwZGQ0OWY3YmQ4YTRlY2IxNGZiZGEzNTA1NWZiZTliMDZiNGQ3YmU1Y2RkZTBmYzdjYzYwZSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
