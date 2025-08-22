package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MILK_COOKIES extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Milk and Cookies";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MILK_COOKIES"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2Njg1Mjk3MCwKICAicHJvZmlsZUlkIiA6ICJkNDg1NWJhYWMzYjM0Mjk1YWJmYjBlZjFiYWIyYzBkOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUb21pYXRhIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ViYTQyMTkzODBhMWU5M2Y2MThhNTY2MGEzZThiNGQ0NDM4ZGUxYjgxNWZkNTQzYzIwNzg3ZGIyYzcwOTU1ZmEiCiAgICB9CiAgfQp9";
    }

}
