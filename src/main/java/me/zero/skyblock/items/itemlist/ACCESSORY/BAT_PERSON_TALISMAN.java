package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BAT_PERSON_TALISMAN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Bat Person Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BAT_PERSON_TALISMAN"; 
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
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzM1MDg0MywKICAicHJvZmlsZUlkIiA6ICI2OGQyMTg3MDBlYmU0YTliYWU0OTcyNTg3ZDIzNzA4OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJzbGVlcG5vdGZvcm1lIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2I4NDFhNDliMTk5YTU5YzQzMWJmM2ZjMzc4M2Y2YjY1NDVjZTc4YzM4MDQyNjE3ZjY2ZWJkODdjZGQ1NDhlOGMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
