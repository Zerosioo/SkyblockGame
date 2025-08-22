package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SMALL_XTREE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Small Holiday Tree";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SMALL_XTREE"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjgyMzY3MCwKICAicHJvZmlsZUlkIiA6ICI3Yjk5ZDIwZDc3YmU0MGViOTMxN2NmN2FhYzM5MTI1NSIsCiAgInByb2ZpbGVOYW1lIiA6ICJHb2F0bWFuVmlpIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzMyZmM1NjFlYzI5ZjJmYThjNTE3OTJhOGE4MmY5OTVjYjFhOWJjNTc5NTEyMzBjMTczMThiODBiNjg2NThhNjEiCiAgICB9CiAgfQp9";
    }

}
