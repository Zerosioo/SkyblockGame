package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLD_SADAN_HEAD extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Golden Sadan Head";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOLD_SADAN_HEAD"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getStrength() {
        return 15;
    }

    @Override
    public int getHealth() {
        return 70;
    }

    @Override
    public int getDefense() {
        return 35;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyNDEyNDIxMTUxNiwKICAicHJvZmlsZUlkIiA6ICJiNTM5NTkyMjMwY2I0MmE0OWY5YTRlYmYxNmRlOTYwYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJtYXJpYW5hZmFnIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU3NjZhMGQyMWQyNjFjODc4NzYzY2E4MjY0Y2QyZGQwYjE3ZWNmYWMzNDI0MTFkYjA3ODg2YjA3OGU2Y2IwMTMiCiAgICB9CiAgfQp9";
    }

}
