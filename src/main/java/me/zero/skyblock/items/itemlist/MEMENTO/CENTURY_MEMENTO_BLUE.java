package me.zero.skyblock.items.itemlist.MEMENTO;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CENTURY_MEMENTO_BLUE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Cake Slice of the Century";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Taste of blueberry.")); 
    }

    @Override
    public String getId() {
        return "CENTURY_MEMENTO_BLUE"; 
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
        return ItemType.MEMENTO;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5MzQzMTQ3OTAzMywKICAicHJvZmlsZUlkIiA6ICI2NDZhMmVhYzg2OWM0N2ZmYmYzZjRiMTc3Y2FhNDM0MiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTZXJwZW50U2FnZXMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDU2NTgwYTFjMTAzZjAwZTczZGM1MGE2OGIzNmJlZWJhNWI3NWQ3ZTUxOGZhNzg5MzJjMmQwMmVlNWQ5MjFkNyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
