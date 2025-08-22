package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CARROT_GENERATOR_4 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Carrot Minion IV";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CARROT_GENERATOR_4"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5MzM1NzA2ODcsInByb2ZpbGVJZCI6IjVkODgxNDRhMzhjYzRkZWVhODA3MzYwODc2YzIxYzU4IiwicHJvZmlsZU5hbWUiOiJSZW1WTiIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzM5OWMwMzczZWVkN2UxMmQ1YzIxMmUxM2M1MTQyMmUyMWQ0ZWM3ZmEzMDFmNWE1YzY4NGY4MTZhMmViMmFhYiJ9fX0=";
    }

}
