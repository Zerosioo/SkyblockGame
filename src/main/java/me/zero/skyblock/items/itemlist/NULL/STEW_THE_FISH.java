package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STEW_THE_FISH extends SItem implements ItemStatistics, Museum {

    @Override
    public String getName() {
        return "Stew the Fish";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7The stew was","§7expired.")); 
    }

    @Override
    public String getId() {
        return "STEW_THE_FISH"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RAW_FISH;
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

}
