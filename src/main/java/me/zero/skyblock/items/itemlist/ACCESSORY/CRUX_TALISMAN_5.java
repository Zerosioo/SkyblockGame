package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CRUX_TALISMAN_5 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Crux Heirloom";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CRUX_TALISMAN_5"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4NDM1MzQ1MTk5OSwKICAicHJvZmlsZUlkIiA6ICJkYmEyNmVkNTk2ZmE0NjBjOTZjOThhYWYwOWM2MDZhNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJPcmlnaW5hbFJlemEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjFmNTA3NGRiODZiNjY5Mzc2ZTcxZGQ4ZmU3MDcxNmY3M2UwZTg0Zjk1NTg3OWE0NjgyZWY1ZmExZWE4MmQyZCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
