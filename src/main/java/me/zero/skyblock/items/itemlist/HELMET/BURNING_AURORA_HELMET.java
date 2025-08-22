package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BURNING_AURORA_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Burning Aurora Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BURNING_AURORA_HELMET"; 
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
    public int getHealth() {
        return 254;
    }

    @Override
    public int getDefense() {
        return 79;
    }

    @Override
    public int getIntelligence() {
        return 302;
    }

    @Override
    public double getAbilityDamage() {
        return 25.0;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDQ4OTI0OSwKICAicHJvZmlsZUlkIiA6ICJiNzVjZDRmMThkZjg0MmNlYjJhY2MxNTU5MTNiMjA0YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJLcmlzdGlqb25hczEzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Y4ODZiNDg0Yjc1MGMzNjcxMDc4OTI1ODY5MzBhNWU1MGNkNTdlOWJlODQzYmQzZGI3ZWIyMTdjYjc4MmYwYTEiCiAgICB9CiAgfQp9";
    }

}
