package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CREATIVE_MIND extends SItem implements ItemStatistics, Sellable, Museum {

    @Override
    public String getName() {
        return "Creative Mind";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CREATIVE_MIND"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PAINTING;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getPrice() {
        return 123;
    }

}
