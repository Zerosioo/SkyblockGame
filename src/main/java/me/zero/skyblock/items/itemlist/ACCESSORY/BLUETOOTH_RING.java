package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLUETOOTH_RING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Bluetooth Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BLUETOOTH_RING"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwNzg3ODE3NTgzMCwKICAicHJvZmlsZUlkIiA6ICI0MmU3ZjY0N2MxNmI0M2Q1YTZlYjBkYjg5MWYyOGIxNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJIZW5yeVBsYXlzVVMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWZmZmRiNGY3NWUxNjc4ZWNmYWE1ZjQyYTMyZjExZTFjYzA4Nzk0NmY0ODU3NDYzYWU2NjQ3Y2MzZTAwNzllMiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
