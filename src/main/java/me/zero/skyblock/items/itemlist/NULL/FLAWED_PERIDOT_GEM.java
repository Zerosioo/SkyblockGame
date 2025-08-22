package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLAWED_PERIDOT_GEM extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Flawed Peridot Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLAWED_PERIDOT_GEM"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 240;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwNzY0MjI5NDU2MSwKICAicHJvZmlsZUlkIiA6ICJkZTU3MWExMDJjYjg0ODgwOGZlN2M5ZjQ0OTZlY2RhZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNSEZfTWluZXNraW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzVkYTczNGU2M2FhMjIxMTZlNjQ3MDNiYjMzMjcxYzRmYmMzZDEzMzJhNmE2MGMyNGFmNDliODA0MTkzYmY0NiIKICAgIH0KICB9Cn0=";
    }

}
