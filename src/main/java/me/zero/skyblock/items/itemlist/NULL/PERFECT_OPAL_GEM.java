package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PERFECT_OPAL_GEM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Perfect Opal Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PERFECT_OPAL_GEM"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3NDMyNjg4NDU2MSwKICAicHJvZmlsZUlkIiA6ICI0OGNhZmJmNzg4ODg0NDU3ODNmZmI0MTAyNDE5MzI3MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJEcjRnb25GMWdodGVyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzdlNTA5ZjA2YjhkYzM4NDM1OGZmMjQ3MmFiNjJjZTZmZGMyZjY0NmUzMzhlZmRjM2M5ZmIwNWRkYzQzMWY2NCIKICAgIH0KICB9Cn0=";
    }

}
