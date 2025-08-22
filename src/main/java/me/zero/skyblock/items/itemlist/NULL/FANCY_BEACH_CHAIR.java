package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FANCY_BEACH_CHAIR extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Fancy Beach Chair";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FANCY_BEACH_CHAIR"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3MDU4NjM1NDcwNiwKICAicHJvZmlsZUlkIiA6ICJiMTM1MDRmMjMxOGI0OWNjYWFkZDcyYWVhYmMyNTQ1MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUeXBrZW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWU1OWY4NDY3NzA5MjE0MzY5MWE1YjYxMmVjMzg4YWI2MmI4NzliZDRmNzk4MGQzNTVlYzc3ZTdmMGM3YjQ5YyIKICAgIH0KICB9Cn0=";
    }

}
