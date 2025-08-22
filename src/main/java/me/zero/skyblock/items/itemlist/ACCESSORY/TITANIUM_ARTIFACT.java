package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TITANIUM_ARTIFACT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Titanium Artifact";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TITANIUM_ARTIFACT"; 
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
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public int getMiningSpeed() {
        return 45;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDQ4MDc5MjAxMiwKICAicHJvZmlsZUlkIiA6ICIxZDUyMzNkMzg4NjI0YmFmYjAwZTMxNTBhN2FhM2E4OSIsCiAgInByb2ZpbGVOYW1lIiA6ICIwMDAwMDAwMDAwMDAwMDBKIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzk4ZWMyMWQyMGYxYWFmNTYzNWY0OGJlZGE4ODYyNjQwM2M2Mzg1YjgxNjczZmI3Y2ZhN2ZmODIxNzljNjNlMzkiCiAgICB9CiAgfQp9";
    }

}
