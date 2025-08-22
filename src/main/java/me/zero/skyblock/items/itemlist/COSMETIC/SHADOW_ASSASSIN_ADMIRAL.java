package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SHADOW_ASSASSIN_ADMIRAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Admiral Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SHADOW_ASSASSIN_ADMIRAL"; 
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
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDIyNTA5NTgxNywKICAicHJvZmlsZUlkIiA6ICI0ZTMwZjUwZTdiYWU0M2YzYWZkMmE3NDUyY2ViZTI5YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJfdG9tYXRvel8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDdmY2ZhNWIwYWY4NTVmMzE0NjA2YTVjZDJiNTk3NDc1Mjg2YTE1MmQxZWUwOGQ5OTQ5YTYzODZjYmM0NmE4ZSIKICAgIH0KICB9Cn0=";
    }

}
