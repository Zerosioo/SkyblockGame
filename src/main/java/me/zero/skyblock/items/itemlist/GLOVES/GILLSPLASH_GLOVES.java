package me.zero.skyblock.items.itemlist.GLOVES;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GILLSPLASH_GLOVES extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Gillsplash Gloves";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GILLSPLASH_GLOVES"; 
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
        return ItemType.GLOVES;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.PROFESSIONAL;
    }

    @Override
    public int getPrice() {
        return 9000;
    }

    @Override
    public int getHealthRegeneration() {
        return 2;
    }

    @Override
    public int getFishingSpeed() {
        return 14;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MjU1OTQ2NDQzNiwKICAicHJvZmlsZUlkIiA6ICJiNTM5NTkyMjMwY2I0MmE0OWY5YTRlYmYxNmRlOTYwYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJtYXJpYW5hZmFnIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzZmNWNiNDAxMjM5YTM0MTA2MzJjMWJmMDQwYzliNmIyNDkyZDI4MTliODhhMzYzMmYxZGUzZTBjZWVjMDg4MTIiCiAgICB9CiAgfQp9";
    }

}
