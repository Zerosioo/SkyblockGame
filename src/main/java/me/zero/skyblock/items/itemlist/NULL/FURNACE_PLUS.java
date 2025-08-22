package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FURNACE_PLUS extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Furnace+";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FURNACE_PLUS"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjE2MTQ0NiwKICAicHJvZmlsZUlkIiA6ICJkOGNkMTNjZGRmNGU0Y2IzODJmYWZiYWIwOGIyNzQ4OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJaYWNoeVphY2giLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWM5NDk5M2E5Yzg4MDI1ZWFhZWNjY2E4ZDYxYTcxZDgxMmNhYzVjZjczNjFjY2ZkMjkxODc5OTMxOTM0MjliZSIKICAgIH0KICB9Cn0=";
    }

}
