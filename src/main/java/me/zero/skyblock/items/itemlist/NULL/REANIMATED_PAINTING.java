package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REANIMATED_PAINTING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Reanimated Painting";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REANIMATED_PAINTING"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MTAyMDQwMSwKICAicHJvZmlsZUlkIiA6ICJiYWRkZjIxZTFmNWE0ZGYzOGVjZmNkOTYwY2E0YzA5YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJBbmRlckJUIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2YwMmE4YjU3MjYxOWU4NjQyMDE1NWE5ODgzNDJjM2M3ZmIxYjgxNzdhMjUwYWFhOTdmOGRmYzRlMWFjODFmMDciCiAgICB9CiAgfQp9";
    }

}
