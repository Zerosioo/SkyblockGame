package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAMP_WHITE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "White Lamp";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LAMP_WHITE"; 
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
    public int getPrice() {
        return 500;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxNzk3NjA4MjgwMiwKICAicHJvZmlsZUlkIiA6ICI5OTdjZjFlMmY1NGQ0YzEyOWY2ZjU5ZTVlNjU1YjZmNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJpbzEyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE2NDYyOGIwNjEyYWJkZjc2NDdlNzI0YzBkMzNkY2ZmYzcwNjk2ZmVkMjA0NTljZGYwYTUwNGRhZTk0NGI2YjUiCiAgICB9CiAgfQp9";
    }

}
