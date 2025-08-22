package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAMP_LIGHT_BLUE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Light Blue Lamp";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LAMP_LIGHT_BLUE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjYyNTQyMSwKICAicHJvZmlsZUlkIiA6ICIzMzE5Y2ZkMTdiMDU0MTEzOTdiYTI4ZjlhMmJjMTg1NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJQYW5zaG9GZWlrIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2M4NmMxODBhMjE3MGI5NzgwZmNmMWYwNjU2YzRjMGJjOWJkYTM4YjY3NWFkNjYzZDM3MzcyN2E0NDFjYWExNDQiCiAgICB9CiAgfQp9";
    }

}
