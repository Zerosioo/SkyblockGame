package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HOT_FERVOR_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Hot Fervor Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HOT_FERVOR_HELMET"; 
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
        return 227;
    }

    @Override
    public int getDefense() {
        return 126;
    }

    @Override
    public int getTrueDefense() {
        return 6;
    }

    @Override
    public int getIntelligence() {
        return 19;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDMwMzExNSwKICAicHJvZmlsZUlkIiA6ICI0OTVlYTMyM2E0N2U0ODk0OWRjZmJmNDQxZmFhODM4YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJDb29sZVZlbnQxNjgiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzAzMGMzMjE3YTJhYzA3MGU0MDRjZjhjMjFlYWZiYTNhMGY2YjU3OWRiZjRlYzlmZGMxNjMzYWQyMTgwY2YyOCIKICAgIH0KICB9Cn0=";
    }

}
