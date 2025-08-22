package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JERRY_CANDY extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Jerry Candy";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JERRY_CANDY"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTYwNTI5NzgyMiwKICAicHJvZmlsZUlkIiA6ICJiOThjNGFkOGM2MjY0NGYxOWUzYzhhZTE0ZThhMDI1OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ5cnRlZGR5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE3ZjBlNjM1MmI1N2Q2ZmFjOGQ1YzFlNzg4MjU4ODkyN2UxYjE5N2IzMmZiZDMzY2Y1ZjNmZjlkZTk2MTE5M2QiCiAgICB9CiAgfQp9";
    }

}
