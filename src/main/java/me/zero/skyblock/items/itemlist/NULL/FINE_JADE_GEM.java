package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FINE_JADE_GEM extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Fine Jade Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FINE_JADE_GEM"; 
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
    public int getPrice() {
        return 19200;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxODA4Mzg3NjAxNywKICAicHJvZmlsZUlkIiA6ICI0ZTMwZjUwZTdiYWU0M2YzYWZkMmE3NDUyY2ViZTI5YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJfdG9tYXRvel8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjI4ZjFjMGM1MDkyZTEyZDMzNzcwZGY0NWM1ODQ1YTk2MTA4ODYwMzliMzRhYmU5M2ExNmM1ZTk0MmRmYzhlNCIKICAgIH0KICB9Cn0=";
    }

}
