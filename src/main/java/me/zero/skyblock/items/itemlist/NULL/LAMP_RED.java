package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAMP_RED extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Red Lamp";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LAMP_RED"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMTY4NjE4ODAwMSwKICAicHJvZmlsZUlkIiA6ICI5ZDQyNWFiOGFmZjg0MGU1OWM3NzUzZjc5Mjg5YjMyZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUb21wa2luNDIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODRlZWE2YzlhM2FlZjIyNzlhOGVhNGEwMTM5NzcyY2I5NWUwMzdjMTc3MDE1M2I1YzZhMjE1NWI0NjRjYTVhYyIKICAgIH0KICB9Cn0=";
    }

}
