package me.zero.skyblock.items.itemlist.GLOVES;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AMETHYST_GAUNTLET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Amethyst Gauntlet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "AMETHYST_GAUNTLET"; 
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
        return Gamestage.SKILLED;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA1MjYwNDI5MCwKICAicHJvZmlsZUlkIiA6ICI3ZGEyYWIzYTkzY2E0OGVlODMwNDhhZmMzYjgwZTY4ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJHb2xkYXBmZWwiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM5Mjc2MTNiNTI0NGZjODA5MmYzYWFjYzI2YTBlMmRjYTUxZjIzYzYzZTdmYTk1OTNjYzE0MGQwYjA5ZDg4NyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
