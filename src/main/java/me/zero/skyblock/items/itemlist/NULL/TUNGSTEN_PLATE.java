package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TUNGSTEN_PLATE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Tungsten Plate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TUNGSTEN_PLATE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwOTU4MjI5MjMwMCwKICAicHJvZmlsZUlkIiA6ICJkZTU3MWExMDJjYjg0ODgwOGZlN2M5ZjQ0OTZlY2RhZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNSEZfTWluZXNraW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDgzZWQyMTdkZmQ0OTc1MzllODZhYjViODk4YjdiM2JmNWExODY0OTJlMjRmOGIzN2E2MzRhNzk0N2QxMTgwIgogICAgfQogIH0KfQ==";
    }

}
