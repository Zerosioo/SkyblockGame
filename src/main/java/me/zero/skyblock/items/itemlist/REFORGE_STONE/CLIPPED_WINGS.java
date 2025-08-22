package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CLIPPED_WINGS extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Clipped Wings";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CLIPPED_WINGS"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5Njk0NTA3NzM3NCwKICAicHJvZmlsZUlkIiA6ICI5Y2ZlNTBiMGIzMGE0ODUxOTg3ZTExMjc3N2RmYWRhYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJCdXpCbG9nIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzY1ZTMyNjA2MmNkYzk0OWI4ODMwMjdmOWEzNGE3N2RiM2U0Mjk3NmIyMjRkOTM2NzM5Y2IwYWJkNzUxMzY4ZDciCiAgICB9CiAgfQp9";
    }

}
