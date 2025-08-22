package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MATRIARCH_PARFUM extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Matriarch's Perfume";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MATRIARCH_PARFUM"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RABBIT_STEW;
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

}
