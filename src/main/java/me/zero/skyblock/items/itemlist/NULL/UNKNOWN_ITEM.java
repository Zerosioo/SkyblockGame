package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UNKNOWN_ITEM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Unknown Item";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "UNKNOWN_ITEM"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzU3MzMxNiwKICAicHJvZmlsZUlkIiA6ICI4NDM2OTk1ZDhkZDM0NDVjYjk1ZGM2MDVjYWY3ZWIwOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJraXR0eWNhdGtvIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2EyZGZkYmM3NTM0M2MyNTYxMjEzMjdhNTUyZGY2YzM0NTc0YzNmNWM5MjAwZGIzZmQ1MjBlNDlhZDkzYWM1YTEiCiAgICB9CiAgfQp9";
    }

}
