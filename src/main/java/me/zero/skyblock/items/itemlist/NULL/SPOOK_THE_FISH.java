package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPOOK_THE_FISH extends SItem implements ItemStatistics, Museum {

    @Override
    public String getName() {
        return "Spook the Fish";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SPOOK_THE_FISH"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RAW_FISH;
    }

    @Override
    public byte getDurability() {
        return 1;
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
