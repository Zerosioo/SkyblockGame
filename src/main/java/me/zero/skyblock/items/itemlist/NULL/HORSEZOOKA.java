package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HORSEZOOKA extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Horsezooka";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HORSEZOOKA"; 
    }

    @Override
    public Material getMaterial() {
        return Material.POWERED_MINECART;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

}
