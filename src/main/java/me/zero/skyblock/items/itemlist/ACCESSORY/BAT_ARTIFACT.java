package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BAT_ARTIFACT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Bat Artifact";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BAT_ARTIFACT"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public int getHealth() {
        return 5;
    }

    @Override
    public int getIntelligence() {
        return 3;
    }

    @Override
    public int getSpeed() {
        return 3;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMjAzOTYxNzA5MSwKICAicHJvZmlsZUlkIiA6ICJlZDUzZGQ4MTRmOWQ0YTNjYjRlYjY1MWRjYmE3N2U2NiIsCiAgInByb2ZpbGVOYW1lIiA6ICIwMTAwMDExMDAxMDAwMDExIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzM3N2FkZThhZmIyNTcwODZmYjE4NjFkYTQzYzhhZTQ2OGI4ZWIwNTc4ZmFkYTg0MzAzODU4NTE3YmExNzIxN2UiCiAgICB9CiAgfQp9";
    }

}
