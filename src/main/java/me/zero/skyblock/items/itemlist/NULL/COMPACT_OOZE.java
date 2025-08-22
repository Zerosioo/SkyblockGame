package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COMPACT_OOZE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Compact Ooze";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oPiglins","§7§osometimes chew","§7§oon them, they","§7§ocan even blow","§7§obubbles out of","§7§othem.")); 
    }

    @Override
    public String getId() {
        return "COMPACT_OOZE"; 
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
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MzU5Nzk1MDUwMiwKICAicHJvZmlsZUlkIiA6ICIzYTNmNzhkZmExZjQ0OTllYjE5NjlmYzlkOTEwZGYwYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJOb19jcmVyYXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjYzZjJlYjBhOGYzZWM3YWEwZWRjOGM5OThiM2Q4ZGY2Zjk5NGMwNjJmODViZDRkYzViMzgxOWIyNGQ1MmY5NCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
