package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_RED_SAND_CUBE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Enchanted Red Sand Cube";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_RED_SAND_CUBE"; 
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
        return 128000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0Mzg4NjMwMjEwOSwKICAicHJvZmlsZUlkIiA6ICIxYzdmNmQ3NDJjNjU0ZDZhYTZlMjU3NTM1MTE3MWM3NiIsCiAgInByb2ZpbGVOYW1lIiA6ICJBbHlzYWFLb2JlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2YzMWY1Yzc4YjdlOTYxNTkxMjkzNzU2YjllMTUwMTJkYjEwNDU3ODQ2YzVlYmM1ZGIwZjJiMGUxODczNDY4ZWUiCiAgICB9CiAgfQp9";
    }

}
