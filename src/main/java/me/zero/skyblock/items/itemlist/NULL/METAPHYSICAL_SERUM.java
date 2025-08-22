package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class METAPHYSICAL_SERUM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Metaphysical Serum";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "METAPHYSICAL_SERUM"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4OTk5NTk0ODU3MywKICAicHJvZmlsZUlkIiA6ICIxYmY4ZjBiZDRkZjc0Njg1ODQwNjU2NDc2ZGU0NmNmMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJDcnV6YWRhMjIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWRiZjVlMTBkMDgzN2YyMGRkN2FlNjkxYWE2YjVjNTA4ZTRjZTExZWIxYzVhYTdiMGFjYzcxYTU1NGZjYmQ4MSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
