package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ROUGH_ONYX_GEM extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Rough Onyx Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ROUGH_ONYX_GEM"; 
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
        return 3;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwNzY0MTg5MjE1NywKICAicHJvZmlsZUlkIiA6ICI2NmRmYzFmNTRlNTU0ZTZmODJjNTA5ZjM1NTJiYTkwZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJadWFyaWciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzA0ZDdiM2QxMTE0M2RhNzc2YzI1Yjg1YzBkM2Y0YzJiYTFjOTlmZjU3YWVhNGUzNGI4MDgwMDJkYjdmMzllOSIKICAgIH0KICB9Cn0=";
    }

}
