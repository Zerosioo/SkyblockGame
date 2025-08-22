package me.zero.skyblock.items.itemlist.GLOVES;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DRAGONFUSE_GLOVE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Dragonfuse Glove";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DRAGONFUSE_GLOVE"; 
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
        return ItemType.GLOVES;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public int getHealth() {
        return 30;
    }

    @Override
    public int getDefense() {
        return 5;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2NTY0NDAzODE0NywKICAicHJvZmlsZUlkIiA6ICIxNDJjODU1M2ZkZTU0NjFmYTllMzE0OWUzOTMyMjY4YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJzbWVsbGVycnkiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjI0YjYzOWM0OTBlZDRlYTI4YTBiMDkyYWU5OWYzZGRlNTA5MWU0ODBlY2JkMWI5MDg0MTY1ZmM0ZjVhMmQ1IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
