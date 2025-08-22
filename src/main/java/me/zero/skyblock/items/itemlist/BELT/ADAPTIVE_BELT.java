package me.zero.skyblock.items.itemlist.BELT;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ADAPTIVE_BELT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Adaptive Belt";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ADAPTIVE_BELT"; 
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
        return ItemType.BELT;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getStrength() {
        return 5;
    }

    @Override
    public int getHealth() {
        return 10;
    }

    @Override
    public int getDefense() {
        return 5;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5MjI5ODI2MTU3NCwKICAicHJvZmlsZUlkIiA6ICIwOWQ3YmJjNGYxZmU0ZjlkYjRiZmE1MTY2NDA3OTcyYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJlemtkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzcwYmY2ZDc2ZjJhMDNmMzE5ZmZmZTcyNWY4MmI4MGI5MjUyOTFlZmRhMzZkNGRiMjViYWNkN2VhODZhNjU3YyIKICAgIH0KICB9Cn0=";
    }

}
