package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BUILDER_BUSH extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Bush";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BUILDER_BUSH"; 
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
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MzE3NjgzODQ1MCwKICAicHJvZmlsZUlkIiA6ICJmZTE0M2FhZTVmNGE0YTdiYjM4MzcxM2U1Mjg0YmIxYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJKZWZveHk0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzUyOTc5Yjk4ZWYxN2Y5ZmJmMTlhNDE0MDZiOGI0ODAwOGY3OTBjOGNkNjE4MzdiMzdmNGM1MzhiNDBlMjlkMyIKICAgIH0KICB9Cn0=";
    }

}
