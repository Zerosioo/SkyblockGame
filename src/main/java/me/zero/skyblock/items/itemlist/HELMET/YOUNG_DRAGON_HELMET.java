package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YOUNG_DRAGON_HELMET extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Young Dragon Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "YOUNG_DRAGON_HELMET"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getPrice() {
        return 100000;
    }

    @Override
    public int getHealth() {
        return 70;
    }

    @Override
    public int getDefense() {
        return 110;
    }

    @Override
    public int getSpeed() {
        return 20;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA1MDI3MjQwNiwKICAicHJvZmlsZUlkIiA6ICJlMjc5NjliODYyNWY0NDg1YjkyNmM5NTBhMDljMWMwMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJLRVZJTktFTE9LRSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hMGU4MWVkMDdkZmIwMjQ0ZDU2ZjRkNWYyYjM3NTUzZWMwMjZmYjQ3OTZmMGZiMGM1N2E4ZWIyNjQ5ODNlMWUwIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
