package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAMP_GREEN extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Green Lamp";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LAMP_GREEN"; 
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
    public int getPrice() {
        return 500;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjY0NzYwNiwKICAicHJvZmlsZUlkIiA6ICI4NzViMjk5MjQyODM0Njc1ODcwMzlkZWUxNzVmNTc0YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJMc0thaXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGY3MGNlNGFlMjAwMTM2MjhhYTE5NzRiMDIyYzg1MmIzMDc5ZTUyNWM0ZWE5M2JhN2QwMmQ2NWM1MmI0N2NkZiIKICAgIH0KICB9Cn0=";
    }

}
