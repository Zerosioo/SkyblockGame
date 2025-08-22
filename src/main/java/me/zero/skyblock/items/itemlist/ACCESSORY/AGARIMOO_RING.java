package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AGARIMOO_RING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Agarimoo Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "AGARIMOO_RING"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public int getFishingSpeed() {
        return 2;
    }

    @Override
    public int getFishingWisdom() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3OTc3MzU2MjMwOCwKICAicHJvZmlsZUlkIiA6ICJiNTAwOGEyMGJkY2U0YjJlOTU5NWZlNzY2MDlmYjUzNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNT1JJU3hTVE9QQkFOIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2QzZWJmMzhiNGE3MDhlYjAwNzQ1ZDFmYjg3YTUzY2I4MWE3YWY2Y2MxNzhkOWEyYzExMTZjMmNiY2ZmOTRmZWEiCiAgICB9CiAgfQp9";
    }

}
