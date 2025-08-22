package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CONDENSED_FERMENTO extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Condensed Fermento";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CONDENSED_FERMENTO"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 2250000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2Njg4NjkyMDczOSwKICAicHJvZmlsZUlkIiA6ICJkYmQ4MDQ2M2EwMzY0Y2FjYjI3OGNhODBhMDBkZGIxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ4bG9nMjEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODIzM2QzYTcwZDgyZWVlMWNhYWE1OGMxNmI4M2VlNjIyNGU4YmZjN2NkYTYzNjc5Mzg1M2UwNDFhMWZiYWE2YiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
