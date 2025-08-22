package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GLOSSY_MINERAL_TALISMAN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Glossy Mineral Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GLOSSY_MINERAL_TALISMAN"; 
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
    public int getMiningFortune() {
        return 6;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA1Mjk1NjIxOCwKICAicHJvZmlsZUlkIiA6ICI2YWVmMjM3Y2RhNDY0Y2QzYTdiZDcxYjg3YzFlMDEwNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJLYWlqdW5va2kiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTNhMjZhZDQ2MjBkZGVjMjdiYzFkNjVmNDNjZWRjMTMzMTVjNzgzZTFhNWEzZTMxMjJjMGFkNDU4ZGFkNTVjNCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
