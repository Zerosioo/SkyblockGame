package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAGMA_FISH_GOLD extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Gold Magmafish";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MAGMA_FISH_GOLD"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public int getPrice() {
        return 128000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MjQ4ODAzNzQ1NywKICAicHJvZmlsZUlkIiA6ICJmY2U2MjNhMDYwNWY0YzJmYTg0Zjk3Yjc3ODYwYTNjMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJQcnJpbnQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTMyNGVkYTZhZjg1ZTUwZjM1MTgwNjA3MzQxNzI4ZmY5MGZhZWExNDY1YmU1N2E2MjQyYzZkZWE2M2FhM2YyOCIKICAgIH0KICB9Cn0=";
    }

}
