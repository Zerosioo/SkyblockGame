package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PET_SKIN_ROCK_COOL extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "CoolRock";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PET_SKIN_ROCK_COOL"; 
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
        return Rarity.RARE;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwOTQ3ODc1Nzg5MCwKICAicHJvZmlsZUlkIiA6ICI0ZDcwNDg2ZjUwOTI0ZDMzODZiYmZjOWMxMmJhYjRhZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJzaXJGYWJpb3pzY2hlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ZlZmNkYmI3ZDk1NTAyYWNjMWFlMzVhMzJhNDBjZTRkZWM4ZjRjOWYwZGEyNmM5ZDlmZTdjMmMzZWI3NDhmNiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
