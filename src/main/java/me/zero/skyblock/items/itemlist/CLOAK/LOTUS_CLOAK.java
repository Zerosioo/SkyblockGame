package me.zero.skyblock.items.itemlist.CLOAK;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LOTUS_CLOAK extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Lotus Cloak";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LOTUS_CLOAK"; 
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
        return ItemType.CLOAK;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public int getFarmingFortune() {
        return 5;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MjUwMjgzMDY2NCwKICAicHJvZmlsZUlkIiA6ICJiNTM5NTkyMjMwY2I0MmE0OWY5YTRlYmYxNmRlOTYwYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJtYXJpYW5hZmFnIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2VlNDBkNzc2MmQyYjdhZWQ1ZDkyNWQxN2Y3YjNjMTQ1MWU3MDljMjUzN2E1NTQ2YjFjZTZlMGQ4ZWUyNzU3ZDQiCiAgICB9CiAgfQp9";
    }

}
