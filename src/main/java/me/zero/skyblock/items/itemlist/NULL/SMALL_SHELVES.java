package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SMALL_SHELVES extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Small Shelves";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SMALL_SHELVES"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NTk1NjUxMiwKICAicHJvZmlsZUlkIiA6ICI4N2RiMmNjNWY4Y2I0MjI4YTU0OGRiMzJlM2Y0NmFmNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJZVG1hdGlhczEzbG9sIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2IwYTVkYTZhMWFiYzViNGU5MDk1NjdlZGUzMzM5OGUyZTViYTUzZWVkNjJhNTQwMzBlYjQyNTM1ZTE4MGI1N2QiCiAgICB9CiAgfQp9";
    }

}
