package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FOOD_TROUGH extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Food Trough";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FOOD_TROUGH"; 
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
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjUyNjkxMSwKICAicHJvZmlsZUlkIiA6ICIxZjEyNTNhYTVkYTQ0ZjU5YWU1YWI1NmFhZjRlNTYxNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJOb3RNaUt5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzc4MDE4NmI3ZTExNDJlNWZjNjQwNjExZDY3ODg0MjhiNjZhMmViMGVlOTRkODIwMjY4YTEzMmFkMmNiNzY5YTkiCiAgICB9CiAgfQp9";
    }

}
