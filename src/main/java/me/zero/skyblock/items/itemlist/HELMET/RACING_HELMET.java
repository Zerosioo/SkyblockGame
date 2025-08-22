package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RACING_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Racing Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RACING_HELMET"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1NTg2ODcxMjQwMCwKICAicHJvZmlsZUlkIiA6ICJmZTYxY2RiMjUyMTA0ODYzYTljY2E2ODAwZDRiMzgzZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNeVNoYWRvd3MiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmNlMDc0NmIxMmVlNDA1Mzk1OGUxNDBiYTI5NTkzMjcyYmQ4NGNhMzRiYWY1MGQwZDgwYjViYzNjNjE1ZTljNiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
