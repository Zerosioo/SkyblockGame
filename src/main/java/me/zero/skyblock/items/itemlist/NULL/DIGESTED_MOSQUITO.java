package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIGESTED_MOSQUITO extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Digested Mosquito";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIGESTED_MOSQUITO"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ROTTEN_FLESH;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

}
