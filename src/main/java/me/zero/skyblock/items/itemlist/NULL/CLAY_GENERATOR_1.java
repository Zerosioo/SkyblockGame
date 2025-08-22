package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CLAY_GENERATOR_1 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Clay Minion I";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CLAY_GENERATOR_1"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5MTkyMjM1NzcsInByb2ZpbGVJZCI6IjVkODgxNDRhMzhjYzRkZWVhODA3MzYwODc2YzIxYzU4IiwicHJvZmlsZU5hbWUiOiJSZW1WTiIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWY5YjMxMmM4ZjUzZGEyODkwNjBlNjQ1Mjg1NTA3MmUwNzk3MTQ1OGFiYmYzMzhkZGVjMzUxZTE2YzE3MWZmOCJ9fX0=";
    }

}
