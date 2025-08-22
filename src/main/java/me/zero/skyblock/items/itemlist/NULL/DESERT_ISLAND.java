package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DESERT_ISLAND extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Desert Island";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DESERT_ISLAND"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMzIxNDI1NzkxNCwKICAicHJvZmlsZUlkIiA6ICI5ZDQyNWFiOGFmZjg0MGU1OWM3NzUzZjc5Mjg5YjMyZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUb21wa2luNDIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODMxNDA1Mzg5MWZiOGEyYWQ3YTY5ZWY0MzMyOTM2MGFhZGVhODFhZDUxNWM1Zjg3NWMwMmJkMGNkOTIzMzNiZSIKICAgIH0KICB9Cn0=";
    }

}
