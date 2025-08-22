package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOTTLED_ODONATA extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Bottled Odonata";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BOTTLED_ODONATA"; 
    }

    @Override
    public Material getMaterial() {
        return Material.EXP_BOTTLE;
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
