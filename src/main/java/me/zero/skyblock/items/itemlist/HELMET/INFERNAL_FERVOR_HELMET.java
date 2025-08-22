package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INFERNAL_FERVOR_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Infernal Fervor Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "INFERNAL_FERVOR_HELMET"; 
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
        return 454;
    }

    @Override
    public int getDefense() {
        return 252;
    }

    @Override
    public int getTrueDefense() {
        return 12;
    }

    @Override
    public int getIntelligence() {
        return 38;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDI1ODUyOCwKICAicHJvZmlsZUlkIiA6ICI0NWY3YTJlNjE3ODE0YjJjODAwODM5MmRmN2IzNWY0ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJfSnVzdERvSXQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWQ0N2NmNmUxMmQxMmE1ZWIxNjE3NTliYTk1Njg5YTkyMzdlYzExMTQ3M2U5MmExNDBlY2FiMDE1OGRmZDI1OCIKICAgIH0KICB9Cn0=";
    }

}
