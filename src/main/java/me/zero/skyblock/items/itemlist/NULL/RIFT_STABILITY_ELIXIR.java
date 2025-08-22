package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RIFT_STABILITY_ELIXIR extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Stability Elixir";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RIFT_STABILITY_ELIXIR"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzODA5MDk1MTYxMywKICAicHJvZmlsZUlkIiA6ICJmYzUwMjkzYTVkMGI0NzViYWYwNDJhNzIwMWJhMzBkMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzY1NTUzODEyMDliZjk4OWU4Y2FhYzNhZThkNmI3ZTE5MzM3M2YxNzE4MDg4ZjVkYmYxMjJmNzFmNWVhZjkwZjAiCiAgICB9CiAgfQp9";
    }

}
