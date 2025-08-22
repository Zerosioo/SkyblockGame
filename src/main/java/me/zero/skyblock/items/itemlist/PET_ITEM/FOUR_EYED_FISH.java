package me.zero.skyblock.items.itemlist.PET_ITEM;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FOUR_EYED_FISH extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Four-Eyed Fish";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FOUR_EYED_FISH"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4MDIxNzQ3ODIwMSwKICAicHJvZmlsZUlkIiA6ICJhNWVmNzE3YWI0MjA0MTQ4ODlhOTI5ZDA5OTA0MzcwMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJkZXBsZXRpbmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTliOWY0M2I1MWJkNDViZWRmMDllNDU4MmQ3NjJkMjZjMDMxODQ3ZmM4ZjMwZDI1MzA1NzkyYzU3NDE4MWQzZiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
