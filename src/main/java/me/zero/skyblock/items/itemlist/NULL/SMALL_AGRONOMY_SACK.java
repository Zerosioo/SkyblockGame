package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SMALL_AGRONOMY_SACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Small Agronomy Sack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SMALL_AGRONOMY_SACK"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxNTAzODQ5ODI5NiwKICAicHJvZmlsZUlkIiA6ICI4MzdjZjgzZGJiZGU0OTUxOWI1ZGEzZTZhY2E1ZDBkMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJGYXJkaW5fTmV0aGVyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzJhYjg3OWUxZTU5MDA0MTE0NmJjNzhjMDE4YWY1ODc3ZDM5ZTU0NzVlYjdkYjM2OGZjYWYyYWNkYTM3MzgzM2QiCiAgICB9CiAgfQp9";
    }

}
