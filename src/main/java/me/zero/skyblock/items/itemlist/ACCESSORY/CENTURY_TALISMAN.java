package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CENTURY_TALISMAN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Talisman of the Century";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("What's better than a","party? A party with","free goodies!")); 
    }

    @Override
    public String getId() {
        return "CENTURY_TALISMAN"; 
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
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5MzQzMTY3NDM5MywKICAicHJvZmlsZUlkIiA6ICI4ZjE5NjJmYzE4NzY0MDU3ODYxMmIxMzNjODE4YmY5OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOaW9uXzkiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzIwYjc3ZWFhNmJjNGExODNhNjg4OGJhNTJkZjQ4NDE3YTZlMzg1YzNiNDYzYWM0OWI0MGEzYjk2ZTBhNWI3NSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
