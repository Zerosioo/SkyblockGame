package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLD_LIVID_HEAD extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Golden Livid Head";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOLD_LIVID_HEAD"; 
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
        return 60;
    }

    @Override
    public int getDefense() {
        return 30;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyNTA1NDYzNjc3MSwKICAicHJvZmlsZUlkIiA6ICI4MmM2MDZjNWM2NTI0Yjc5OGI5MWExMmQzYTYxNjk3NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJOb3ROb3RvcmlvdXNOZW1vIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzYyNTEyYWM2Y2M1ZDhjN2FlM2RkZGVlZTJjNDI5ZDRhMmQ2YTgzNDFiZGUwNTZlMThlNWFlMjEwMTFiYmU2NDMiCiAgICB9CiAgfQp9";
    }

}
