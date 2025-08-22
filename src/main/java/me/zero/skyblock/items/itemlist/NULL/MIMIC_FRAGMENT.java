package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MIMIC_FRAGMENT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Mimic Fragment";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MIMIC_FRAGMENT"; 
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
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NDAyMDMyMSwKICAicHJvZmlsZUlkIiA6ICI1OTgyOWY1ZGY3MmM0ZmFlOTBmOGVhYmM0MjFjMzJkYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJQZXBwZXJEcmlua2VyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzgzOTRlOGZkZjcyYTAyYzIzYjAwYTIwZDY4ZjBmZDhjMzQzYmI4MWYzY2EzNGJkMGY3YjRmOWMzZGE0MTZlNiIKICAgIH0KICB9Cn0=";
    }

}
