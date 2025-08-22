package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RING_OF_BROKEN_LOVE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Ring of Broken Love";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("This time around,","fate really got in","the way of love.")); 
    }

    @Override
    public String getId() {
        return "RING_OF_BROKEN_LOVE"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MTc5MzU5MzMyNSwKICAicHJvZmlsZUlkIiA6ICJkYmQyYjU4N2VjMWY0ZTgxYTNkOGFlODM5OWJiMDFjMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJjYXRzaW5zcGFjZWUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzQwZTdjMDE2YTgzYzdjNTgwNmI4ZWZmMGZhMTJmMjczYzAzNmExOGU1MDY2YmRlZDI4MGZhNmJlZGU3Y2M5ZCIKICAgIH0KICB9Cn0=";
    }

}
