package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BURNING_TERROR_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Burning Terror Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BURNING_TERROR_HELMET"; 
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
    public int getCritDamage() {
        return 79;
    }

    @Override
    public int getHealth() {
        return 254;
    }

    @Override
    public int getDefense() {
        return 79;
    }

    @Override
    public int getIntelligence() {
        return 24;
    }

    @Override
    public int getSpeed() {
        return 19;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDExMzIwNywKICAicHJvZmlsZUlkIiA6ICIzNmMxODk4ZjlhZGE0NjZlYjk0ZDFmZWFmMjQ0MTkxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJMdW5haWFuIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ0ODJlYzM1MWYzNTM0NDU3NzViNDM5ZWJjOTA5ZDU3MDI3MzJmOGJhZTlkMzJiMGIwODg2MGIzZDY0MzkwNjEiCiAgICB9CiAgfQp9";
    }

}
