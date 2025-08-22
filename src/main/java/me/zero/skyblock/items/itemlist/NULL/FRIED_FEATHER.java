package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FRIED_FEATHER extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Fried Feather";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7A greasy feather,","§7somehow still in","§7one piece despite","§7having been doused","§7in boiling-hot","§7lava.")); 
    }

    @Override
    public String getId() {
        return "FRIED_FEATHER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FEATHER;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 10000;
    }

}
