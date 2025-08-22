package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MEDIUM_LAVA_FISHING_SACK extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Medium Lava Fishing Sack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MEDIUM_LAVA_FISHING_SACK"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public int getPrice() {
        return 128000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MzYwNjIxNTE0NywKICAicHJvZmlsZUlkIiA6ICJkYmQ4MDQ2M2EwMzY0Y2FjYjI3OGNhODBhMDBkZGIxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ4bG9nMjEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTg0ZTFhMzFmZDUxNzZhYTg4OGFlNGZjMmZlNzVkOGUxMjE4NWFhMDQ1NGYwMzc0MjUyNTBlMjE2YzcwOTc1YyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
