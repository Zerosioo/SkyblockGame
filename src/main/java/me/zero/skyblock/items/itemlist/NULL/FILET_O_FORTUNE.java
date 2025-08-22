package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FILET_O_FORTUNE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Filet O' Fortune";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FILET_O_FORTUNE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.COOKED_FISH;
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
