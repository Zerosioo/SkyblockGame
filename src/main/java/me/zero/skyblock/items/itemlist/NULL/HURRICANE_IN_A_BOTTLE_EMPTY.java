package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HURRICANE_IN_A_BOTTLE_EMPTY extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Empty Hurricane Bottle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HURRICANE_IN_A_BOTTLE_EMPTY"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczMTcxMDg3Njg3MiwKICAicHJvZmlsZUlkIiA6ICIwMzQ2N2E0Yzc5ZGU0ZGM5YTQ4NzU5MGY5NmEwODFmMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTaGFrYVlhbWkiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWQxMjZmZTJkMjc2YTVlZDEzMDI5ZjZmZjY4ODJiYmU1ODhiZWUxNmE4ZTg2ZDYyM2NjMGNlMjhlODYwNGQzNiIKICAgIH0KICB9Cn0";
    }

}
