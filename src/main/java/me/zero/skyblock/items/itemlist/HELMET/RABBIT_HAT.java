package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RABBIT_HAT extends SItem implements ItemStatistics, SkullItem, Sellable, Museum {

    @Override
    public String getName() {
        return "Rabbit Hat";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RABBIT_HAT"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public int getIntelligence() {
        return 5;
    }

    @Override
    public int getSpeed() {
        return 5;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4NzAwMzQ0NTU4MiwKICAicHJvZmlsZUlkIiA6ICJlZTg4M2RmMjM0ZWI0YWM1YTFlNDEwODhhYzZkZWIxNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJUdW5lc0Jsb2NrIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2I1MDQ1OWJjYjA4ZGI1Y2U5M2UwMjEwNzljMWNmYzAzOGM5ZWJlN2FkOWExNDk1MTZlZmU0ZDVlZThhZmI1OWYiCiAgICB9CiAgfQp9";
    }

}
