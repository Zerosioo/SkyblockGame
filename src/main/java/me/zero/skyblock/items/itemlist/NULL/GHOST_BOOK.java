package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GHOST_BOOK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Ghost Book";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GHOST_BOOK"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjY4NTIyMCwKICAicHJvZmlsZUlkIiA6ICI0N2RhZjU4YmJkNTM0OWU2YTI1MWYzMDZkYzhlYjc2ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJZeXJvIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2E3OWJjYWRmZTI0MzhjN2NjM2YzMDQ1ZTNhNDkyNzAyMjNlYmQwMWMwOTRmZTMwZTUzNmJkODBlMzY4YTk5YmQiCiAgICB9CiAgfQp9";
    }

}
