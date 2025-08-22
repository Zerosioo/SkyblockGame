package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KNOCKOFF_COLA extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "KnockOff™ Cola";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "KNOCKOFF_COLA"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MzE5ODgwNTc0NDIsInByb2ZpbGVJZCI6ImIwZDRiMjhiYzFkNzQ4ODlhZjBlODY2MWNlZTk2YWFiIiwicHJvZmlsZU5hbWUiOiJ4RmFpaUxlUiIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzE0YmVmZDRkMzc5N2E4YTZhYjUzY2VlZGViYWIzYzEyYjdiMWYwMzQ0MGJmMDA4NTAxMDAyNWMzNTcxNzYyOCJ9fX0=";
    }

}
