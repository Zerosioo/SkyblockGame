package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FINE_AQUAMARINE_GEM extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Fine Aquamarine Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FINE_AQUAMARINE_GEM"; 
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
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 19200;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwNzY0MDg1NTkyMiwKICAicHJvZmlsZUlkIiA6ICI1OWZmOTU1YzMxYjk0MWI0YWQwNDg4NDk0ODkzNzUzOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNZWdhMzQ5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzJiODIyYjlkYzcwYjljYTIwMDA4YzMzMmY0ODFjYmViYjUyYmQ1MDY2OWNhOThhODlmZDMzZDEzNDVmYTEwZjIiCiAgICB9CiAgfQp9";
    }

}
