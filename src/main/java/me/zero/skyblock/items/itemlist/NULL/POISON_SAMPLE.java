package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POISON_SAMPLE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Poison Sample";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "POISON_SAMPLE"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2NzgzMjczMzY1NSwKICAicHJvZmlsZUlkIiA6ICJiYTcyN2MzM2YwZWE0ZGVjYmI0ZGRjNTcyZWZhNDhlZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJDb2ZmZU1hblRNIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2E4MDg5OWU0NjM1MGNmMDEzNGM2NzU2OWUyZDc2MjE4MWEwNGYzMDc4ZjY0YWNkZDJmZWFkZDk3MTI1MTU0MDYiCiAgICB9CiAgfQp9";
    }

}
