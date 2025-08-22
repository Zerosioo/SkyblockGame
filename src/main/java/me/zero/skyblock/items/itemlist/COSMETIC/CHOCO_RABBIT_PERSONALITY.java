package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHOCO_RABBIT_PERSONALITY extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Choco Rabbit Minion Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CHOCO_RABBIT_PERSONALITY"; 
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
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTkzOTQxMzQ3NCwKICAicHJvZmlsZUlkIiA6ICJlNGUxYmY5NzMwZWI0NDRhYmIyOGIxODgxN2Q0M2YzZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNSU1PR0FNRVMwMzIxIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzlhODE1Mzk4ZTdkYTg5YjFiYzA4ZjY0NmNhZmM4ZTdiODEzZGEwYmUwZWVjMGNjZTZkM2VmZjUyMDc4MDEwMjYiCiAgICB9CiAgfQp9";
    }

}
