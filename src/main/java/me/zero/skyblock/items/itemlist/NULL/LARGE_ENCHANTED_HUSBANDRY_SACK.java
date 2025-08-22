package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LARGE_ENCHANTED_HUSBANDRY_SACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Large Enchanted Husbandry Sack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LARGE_ENCHANTED_HUSBANDRY_SACK"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NTM4NTQ5OSwKICAicHJvZmlsZUlkIiA6ICJiYTBhMzYwZDM5ZDQ0N2JmOTNiZjBhMTU2ZDUzZTZjNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJMZW9sb3oxMDAiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzQ2YTYwNjMyNjNiYTcyMDhhMmEwNmNlZjczMjM0NzkxYzkyZDVmNjcwODBhMzY1NTA4YjAyNDgzZWVmYWY5YSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
