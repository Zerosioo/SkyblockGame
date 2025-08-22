package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TUNGSTEN extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Tungsten";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§oConsidered for a","§olong time to be","§ounbreakable prior","§oto the discovery","§oof the Crystal","§oHollows.")); 
    }

    @Override
    public String getId() {
        return "TUNGSTEN"; 
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
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODkxNDY4MjE4MCwKICAicHJvZmlsZUlkIiA6ICJiZDNhNWRmY2ZkZjg0NDczOTViZDJiZmUwNGY0YzAzMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJwcmVja3Jhc25vIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Q4MTFmM2U3MjNiYmQ0NjM5M2Y4YWFkODU1NmIxZGY4ZWQzM2Y1NTliZTgyN2Y0N2ZlNzM2ZjcwNGMzNTU4NmUiCiAgICB9CiAgfQp9";
    }

}
