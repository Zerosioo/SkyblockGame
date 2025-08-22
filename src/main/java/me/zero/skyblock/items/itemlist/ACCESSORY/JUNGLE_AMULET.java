package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JUNGLE_AMULET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Jungle Amulet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JUNGLE_AMULET"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxOTE4MzY1NjY4MCwKICAicHJvZmlsZUlkIiA6ICJkZTE0MGFmM2NmMjM0ZmM0OTJiZTE3M2Y2NjA3MzViYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTUlRlYW0iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWJmZjY1NDc5ZmI3MDI5ZGVjZmU2Nzc5MzgyNzYyYTA4ZmM3YzhlY2VmZjU0NDhkZTI2M2Q5ZDM3NTA2NmY3YSIKICAgIH0KICB9Cn0=";
    }

}
