package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BURSTSTOPPER_ARTIFACT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Burststopper Artifact";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BURSTSTOPPER_ARTIFACT"; 
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
        return Rarity.EPIC;
    }

    @Override
    public int getStrength() {
        return 2;
    }

    @Override
    public int getTrueDefense() {
        return 3;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MTk2ODA3OCwKICAicHJvZmlsZUlkIiA6ICI4NzViMjk5MjQyODM0Njc1ODcwMzlkZWUxNzVmNTc0YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJMc0thaXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODljYmJiZTdlZDAzNTZkNTg0NjU5NmM0YWQxY2ZhOWZhNzE5ZGIxYzQ1NjhmM2Y3ZjBjNzk3OWU3YTQwMTIwOCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
