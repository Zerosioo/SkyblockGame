package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HOLLOW_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Hollow Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HOLLOW_HELMET"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.PROFESSIONAL;
    }

    @Override
    public int getHealth() {
        return 175;
    }

    @Override
    public int getDefense() {
        return 55;
    }

    @Override
    public int getIntelligence() {
        return 130;
    }

    @Override
    public int getSpeed() {
        return 5;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDI0MjExMCwKICAicHJvZmlsZUlkIiA6ICIxZjEyNTNhYTVkYTQ0ZjU5YWU1YWI1NmFhZjRlNTYxNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJOb3RNaUt5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzRhYWNkNzA1YTI5Yjc5MDUyOGE3MGVlOTNhMWNiZDkyYzAyOTYwMWE3NjJkNTI4MDVmNjA0NjBlN2E3ZmY4ZjciCiAgICB9CiAgfQp9";
    }

}
