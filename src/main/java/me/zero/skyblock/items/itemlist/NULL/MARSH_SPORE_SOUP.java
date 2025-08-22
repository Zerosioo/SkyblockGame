package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MARSH_SPORE_SOUP extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Marsh Spore Soup";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MARSH_SPORE_SOUP"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MUSHROOM_SOUP;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

}
