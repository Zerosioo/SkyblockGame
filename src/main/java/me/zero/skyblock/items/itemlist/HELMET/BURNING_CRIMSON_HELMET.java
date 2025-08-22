package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BURNING_CRIMSON_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Burning Crimson Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BURNING_CRIMSON_HELMET"; 
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
    public int getStrength() {
        return 48;
    }

    @Override
    public int getCritDamage() {
        return 32;
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDM4MTkxMiwKICAicHJvZmlsZUlkIiA6ICJmZDQ3Y2I4YjgzNjQ0YmY3YWIyYmUxODZkYjI1ZmMwZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDEyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ViMDM0YTVkOTdjMjRmZTBlYzkwMmJkMDJmZWM1MmEwOWQ5MTczNjZiZTA2MGM1MWY5YTFhMjc2YjI4NGE5ZDciCiAgICB9CiAgfQp9";
    }

}
