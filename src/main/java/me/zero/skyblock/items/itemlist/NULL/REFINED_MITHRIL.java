package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REFINED_MITHRIL extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Refined Mithril";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REFINED_MITHRIL"; 
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
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public int getPrice() {
        return 204800;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDk5NjQ2NTYzMCwKICAicHJvZmlsZUlkIiA6ICI2ZmU4OTUxZDVhY2M0NDc3OWI2ZmYxMmU3YzFlOTQ2MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJlcGhlbXJhIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzM1YTc2NjMzMDA2MTliYjZhMTU2ZDc2MzUxYWMwNWY3YjNjYWZlYWMzMWUyZmYwNGM1NWNjOWYyMzYzMjc4MzIiCiAgICB9CiAgfQp9";
    }

}
