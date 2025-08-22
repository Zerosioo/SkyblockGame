package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SWEET_FLESH extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Sweet Flesh";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7It's strangely","§7sweet and somewhat","§7sticky...")); 
    }

    @Override
    public String getId() {
        return "SWEET_FLESH"; 
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
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzNTA4OTUyODI4NSwKICAicHJvZmlsZUlkIiA6ICI2MzMyMDgwZTY3YTI0Y2MxYjE3ZGJhNzZmM2MwMGYxZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUZWFtSHlkcmEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjc1NjkyMmMyMWJjMTUxOGJmNjAzNTM1MDkzMGMzYjFmNGM5Yjc0YjEwYjBkNjIxYmFiYWE0ZTQxMTA5YzE3ZiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
