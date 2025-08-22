package me.zero.skyblock.items.itemlist.PET_ITEM;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PET_ITEM_QUICK_CLAW extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Quick Claw";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PET_ITEM_QUICK_CLAW"; 
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
        return ItemType.PET_ITEM;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjcwODkzOCwKICAicHJvZmlsZUlkIiA6ICI4ZjE5NjJmYzE4NzY0MDU3ODYxMmIxMzNjODE4YmY5OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOaW9uXzkiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjMxMmE1YTEyZWNiMjRkNjg1MmRiMzg4ZTZhMzQ3MjFjYzY3ZjUyMmNjZGU3ZTgyNGI5Zjc1ZTk1MDM2YWM5MyIKICAgIH0KICB9Cn0=";
    }

}
