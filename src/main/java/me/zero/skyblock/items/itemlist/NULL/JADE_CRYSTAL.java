package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JADE_CRYSTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Jade Crystal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JADE_CRYSTAL"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMDA3NjM5MzU2NywKICAicHJvZmlsZUlkIiA6ICI1N2IzZGZiNWY4YTY0OWUyOGI1NDRlNGZmYzYzMjU2ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJYaWthcm8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGIxZWFjNDI5MDAwZWIyYzQxOGJlNDZlYTA2YWNkZWZlZDRiNzA1M2EwMGUzZTdmMTEyNzI4MzAwNjhmMjEiCiAgICB9CiAgfQp9";
    }

}
