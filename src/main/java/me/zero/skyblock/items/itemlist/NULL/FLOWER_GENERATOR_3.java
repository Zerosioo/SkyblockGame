package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLOWER_GENERATOR_3 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Flower Minion III";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLOWER_GENERATOR_3"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5MzYzMDEwNDEsInByb2ZpbGVJZCI6IjVkODgxNDRhMzhjYzRkZWVhODA3MzYwODc2YzIxYzU4IiwicHJvZmlsZU5hbWUiOiJSZW1WTiIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGU1YzI0YThiY2QyMWU0ZjBhMzc1NTFhMmFkMTk3YTc5OGJlOTg2ZWYwODM3MWFiMTFlOTVjMjA0NGJiMWJjMCJ9fX0=";
    }

}
