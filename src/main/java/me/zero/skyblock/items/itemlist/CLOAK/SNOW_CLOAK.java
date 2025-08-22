package me.zero.skyblock.items.itemlist.CLOAK;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SNOW_CLOAK extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Snow Cloak";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SNOW_CLOAK"; 
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
        return ItemType.CLOAK;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getHealth() {
        return 5;
    }

    @Override
    public int getIntelligence() {
        return 5;
    }

    @Override
    public int getSpeed() {
        return 2;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2OTM4OTk3ODk1NiwKICAicHJvZmlsZUlkIiA6ICJmYzg3ZTI3YTYwZjY0NjdhOGMwMDgyMmI2ZWY5ZTMyNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJhbmRyZWlvX28iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjEyNGJmYjIyZDZmZjZjMDBhNzNkNWY2NzY5YjkwNzIzMTFiZGU2YzgwMTBkZjU1MWU4Njc1OGU4OTg0YjhiZiIKICAgIH0KICB9Cn0=";
    }

}
