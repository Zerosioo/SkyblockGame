package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TITANIUM_RELIC extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Titanium Relic";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TITANIUM_RELIC"; 
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
    public int getPrice() {
        return 10000;
    }

    @Override
    public int getMiningSpeed() {
        return 60;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDQ4MDgxMjk0NSwKICAicHJvZmlsZUlkIiA6ICI0ZTMwZjUwZTdiYWU0M2YzYWZkMmE3NDUyY2ViZTI5YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJfdG9tYXRvel8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDJmMjQwNWE3YjhkZWZkZGIwYjgyNjhiZWE4ZjJlMTJmYzA5YmJjN2RlMTI5ODFmODVkYjJhNzAwMWFjODFlYiIKICAgIH0KICB9Cn0=";
    }

}
