package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ROUGH_CITRINE_GEM extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Rough Citrine Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ROUGH_CITRINE_GEM"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODQ3NzAxNzcwNiwKICAicHJvZmlsZUlkIiA6ICJhODJkZTliNjZhYjE0OGZhOTQ3OGY0OWJiZjg5OTk1YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJmdWhyM3JibDRiIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzUwZTg1MTdiMzAxNGU3ODM1NTZkYTQ3YjE3YmU5MzE1MDFiMDlkYTViZjg4ODliNzk3ZWMwODdhODc0OWE4OSIKICAgIH0KICB9Cn0=";
    }

}
