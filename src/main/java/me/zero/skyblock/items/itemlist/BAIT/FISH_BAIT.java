package me.zero.skyblock.items.itemlist.BAIT;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FISH_BAIT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Fish Bait";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FISH_BAIT"; 
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
        return ItemType.BAIT;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwODQwMzIyNjIwOCwKICAicHJvZmlsZUlkIiA6ICI0ZDcwNDg2ZjUwOTI0ZDMzODZiYmZjOWMxMmJhYjRhZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJzaXJGYWJpb3pzY2hlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ5ZThkYzlmZGM5ZjAwZTFkMTc2NjZhNDc4N2QzNGNjYTdjYzZkYzAzMGYwZGM2ODYxOTU1NDZmODFjNmYyMiIKICAgIH0KICB9Cn0=";
    }

}
