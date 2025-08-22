package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIAMOND_GENERATOR_4 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Diamond Minion IV";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIAMOND_GENERATOR_4"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5MzUzODgxNDgsInByb2ZpbGVJZCI6IjVkODgxNDRhMzhjYzRkZWVhODA3MzYwODc2YzIxYzU4IiwicHJvZmlsZU5hbWUiOiJSZW1WTiIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTFmYjg3MmYzNWFkMTUzNmQyZDU3MDk3OTdmODQyOTA0M2RjMmY0Y2Q1YTRkOGU5MWI5NDIyZGM1YzUxZGI5NSJ9fX0=";
    }

}
