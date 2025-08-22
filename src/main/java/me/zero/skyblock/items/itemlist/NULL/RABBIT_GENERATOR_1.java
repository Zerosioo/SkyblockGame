package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RABBIT_GENERATOR_1 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Rabbit Minion I";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RABBIT_GENERATOR_1"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5MjAwNzAyMTIsInByb2ZpbGVJZCI6IjU2Njc1YjIyMzJmMDRlZTA4OTE3OWU5YzkyMDZjZmU4IiwicHJvZmlsZU5hbWUiOiJUaGVJbmRyYSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWY1OWMwNTJkMzM5YmI2MzA1Y2FkMzcwZmQ4YzUyZjU4MjY5YTk1N2RmYWY0MzNhMjU1NTk3ZDk1ZTY4YTM3MyJ9fX0=";
    }

}
