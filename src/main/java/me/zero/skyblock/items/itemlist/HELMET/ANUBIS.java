package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ANUBIS extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Anubis";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ANUBIS"; 
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
        return 3001;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjY3MjgwOCwKICAicHJvZmlsZUlkIiA6ICIzN2JhNjRkYzkxOTg0OGI4YjZhNDdiYTg0ZDgwNDM3MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTb3lLb3NhIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzJkMjUxMDdiMDgxM2JjNjk3YzlmM2Q1NWZjOWIwNTQwNWE2OTZlOWJkNTBhZTFjMjQxNjc4ZTI0MDU1NTc1ODgiCiAgICB9CiAgfQp9";
    }

}
