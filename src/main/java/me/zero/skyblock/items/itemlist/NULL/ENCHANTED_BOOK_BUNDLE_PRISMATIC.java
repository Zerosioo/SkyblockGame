package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_BOOK_BUNDLE_PRISMATIC extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Enchanted Book Bundle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_BOOK_BUNDLE_PRISMATIC"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public int getPrice() {
        return 10000;
    }

    @Override
    public int getPristine() {
        return 5;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczNjE4Mzc2MDg4NSwKICAicHJvZmlsZUlkIiA6ICJlOThhZTBlMTI5MDg0ZDA5OTk0MTg4N2Q2YTk0ZTI2NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTZXh5SGF1c2VNYXN0ZXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGRmMGM3ODk5OGJiYTMyYjM3NjU3MWNmZjkyMGZkNzUzYzJlOWEzYmExNDMyYTc2MzgyZTI2YjIzNGM3Yjk0ZCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
