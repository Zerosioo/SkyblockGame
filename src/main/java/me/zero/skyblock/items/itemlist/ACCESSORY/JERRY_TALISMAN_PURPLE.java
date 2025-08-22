package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JERRY_TALISMAN_PURPLE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Purple Jerry Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JERRY_TALISMAN_PURPLE"; 
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
        return Rarity.EPIC;
    }

    @Override
    public int getIntelligence() {
        return -3;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyNjU5NTc5ODMxNywKICAicHJvZmlsZUlkIiA6ICI5ZDQyNWFiOGFmZjg0MGU1OWM3NzUzZjc5Mjg5YjMyZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUb21wa2luNDIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmY4YmQ2MWI2MGE0MjVkMmUwZGViMWRmOTY2NTMyNzc1MGNlYmE4MjJhMGJlODVlMmY0YTNhNzIyZTIwZjdkNiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
