package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BRONZE_SHIP_HULL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Bronze Ship Hull";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BRONZE_SHIP_HULL"; 
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
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTc0MDE1Njg0MDMzMCwKICAicHJvZmlsZUlkIiA6ICJmYzFhOTdlNTgxM2Y0NDI2YTNmZTI4ZjJiNDc1ZjA4ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJnZXRPbmxpbmVQbGF5ZXJzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2E0YTcyNTRmMWFkODQ0ODA5N2Q4M2RkZmM3OTBjOWYwMmJjODg5YWNiZDMwNGI0MTRjZWU1YTEzY2VhZGMxZSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
