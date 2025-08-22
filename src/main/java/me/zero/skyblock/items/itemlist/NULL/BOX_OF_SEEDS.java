package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOX_OF_SEEDS extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Box of Seeds";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BOX_OF_SEEDS"; 
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
    public int getPrice() {
        return 76800;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjE1Njk3NiwKICAicHJvZmlsZUlkIiA6ICI5MGQ1NDY0OGEzNWE0YmExYTI2Yjg1YTg4NTU4OGJlOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJFdW4wbWlhIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzJjM2Y4NTRiYjY1MjY1YWIzZmYyZTM2MjY2OWE1ZjgwNmFiODRkYzI0MGE0Yjk5ZjlhNjJhYjcyNjc3MjhiYTMiCiAgICB9CiAgfQp9";
    }

}
