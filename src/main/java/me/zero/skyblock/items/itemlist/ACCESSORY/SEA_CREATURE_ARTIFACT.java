package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SEA_CREATURE_ARTIFACT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Sea Creature Artifact";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SEA_CREATURE_ARTIFACT"; 
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
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 25000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMjAzODAzODg1NCwKICAicHJvZmlsZUlkIiA6ICI2MTI4MTA4MjU5M2Q0OGQ2OWIzMmI3YjlkMzIxMGUxMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJPbF9OaWNrNjY2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2E0MjcwYzM2NTUxNzhhZmU0NDU5N2I2Mzk0NzA4ODI4YzI5MjQ1NTM2NWJkZGVmOTcxYTM4MWY0MWU0N2Q1ZDAiCiAgICB9CiAgfQp9";
    }

}
