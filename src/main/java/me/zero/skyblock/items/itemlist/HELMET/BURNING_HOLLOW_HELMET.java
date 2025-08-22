package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BURNING_HOLLOW_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Burning Hollow Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BURNING_HOLLOW_HELMET"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public int getHealth() {
        return 273;
    }

    @Override
    public int getDefense() {
        return 86;
    }

    @Override
    public int getIntelligence() {
        return 206;
    }

    @Override
    public int getSpeed() {
        return 8;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDIwNjg0MCwKICAicHJvZmlsZUlkIiA6ICIzYTNmNzhkZmExZjQ0OTllYjE5NjlmYzlkOTEwZGYwYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJOb19jcmVyYXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTJhYTE3YzMyZDI3YjkyODE2YjAwMzYyYzJmNjlkODY3Y2Q5OWJhMzc2ZDEwYjA5Nzc5NjM2ODI4NzgzNGVhMSIKICAgIH0KICB9Cn0=";
    }

}
