package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DANTE_TALISMAN extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Dante Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DANTE_TALISMAN"; 
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
        return Rarity.COMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4NzkwMjUyODI1MiwKICAicHJvZmlsZUlkIiA6ICI2Y2MzNWNiZGFkYzc0OGMxYjc4ZGY0MDQ1Yzk3ZWIxZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJpTHVvbW8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2Y5Mjk4MmYxYTMwMjMxMDY0M2EyMGNlNTE2MjNmODE5OWI3NTQ1ZTcwZGM2YjkzZWQ2YmQ2MWRjNDJmZjIxMyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
