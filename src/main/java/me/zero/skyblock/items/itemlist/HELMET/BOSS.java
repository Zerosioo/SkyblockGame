package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOSS extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Boss";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BOSS"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNOBTAINABLE;
    }

    @Override
    public int getPrice() {
        return 1000000;
    }

    @Override
    public int getHealth() {
        return 1000;
    }

    @Override
    public int getDefense() {
        return 1000;
    }

    @Override
    public int getSpeed() {
        return 60;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0OTU2MzYyNjcwNiwKICAicHJvZmlsZUlkIiA6ICIzY2MxMTY3MWU0MTM0ODM0YjhjMmZjMTY1OGE4OWU3OCIsCiAgInByb2ZpbGVOYW1lIiA6ICJSb3NzaTU2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzFmZjg1YmJlMjlmM2ZjZmFiYTdlNmU2ZTk0NzYwYTg4MWM5ZWI2ZWY0OGNiNjBiODMyN2UwNzM3ZWY4OWMzNzAiCiAgICB9CiAgfQp9";
    }

}
