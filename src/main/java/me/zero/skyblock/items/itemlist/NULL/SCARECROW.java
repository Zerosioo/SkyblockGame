package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SCARECROW extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Scarecrow";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SCARECROW"; 
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
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0Mzk5NjMyNiwKICAicHJvZmlsZUlkIiA6ICJiZmQ3MjMxMGNmYWY0Yjc5OTNlYzhiYzU3ODg3YzU5ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJBbHBoYVNwQW0iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTE3NzQwZTZhNWVkZDhkNGYzOWM3ZjBhOTA2NGE4NGI2ZTRjMjBkM2RiNTU1NTdkNzIzY2U3ZGIzYWQ3Y2M0NiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
