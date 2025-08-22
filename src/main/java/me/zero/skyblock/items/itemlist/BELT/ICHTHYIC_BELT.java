package me.zero.skyblock.items.itemlist.BELT;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ICHTHYIC_BELT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Ichthyic Belt";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ICHTHYIC_BELT"; 
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
        return ItemType.BELT;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 4500;
    }

    @Override
    public int getFishingSpeed() {
        return 6;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MjQ4Nzc2NjA4NSwKICAicHJvZmlsZUlkIiA6ICJiMDBmZWRjOTM0YmU0NWIxOGI3M2MyOTgzNjFjZTg3MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJBbGRlcmJyYXVlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2NhNjQzOGRmY2NjZmUyNmFmMzU2ZjIxNTE4OWJiYmZhYzM5NGUyOGNhZmQ5YjNjYmM0NmEzOWVhY2Q3MWQxMzAiCiAgICB9CiAgfQp9";
    }

}
