package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WHEAT_ISLAND_CRYSTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Wheat Crystal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WHEAT_ISLAND_CRYSTAL"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5NjkzMDQ4NzQ5OCwKICAicHJvZmlsZUlkIiA6ICIwNmE4NjAyZDAwODk0YWQxOTcyMGQ3NGE1OGU1MDZjZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJfMW5kcmFfIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Q0ZDJjODEwMGMwZTZkMzg5MTBlMjRlZmE1MDQzOGNkZjdiZjBhYWViYzQ3MWQ0ZmExNjNhZjJkMjE4YTMzOTUiCiAgICB9CiAgfQp9";
    }

}
