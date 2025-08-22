package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HORSEMAN_CANDLE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Horseman's Candle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HORSEMAN_CANDLE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0Mjc0Nzk4NiwKICAicHJvZmlsZUlkIiA6ICJlOTUyODY0OGZhYzU0ZDdlOGI0ZGU1NDhiMzU3MDY5OCIsCiAgInByb2ZpbGVOYW1lIiA6ICIwNjAwMDEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzQ2Zjc0NjliN2Q5Y2MzNGM4OTkwYTBhZGQ2MzU4NDE5MTdhZjg5Y2E1MmNhZmRkZTU3NTAwN2QxYThjMzk4ZSIKICAgIH0KICB9Cn0=";
    }

}
