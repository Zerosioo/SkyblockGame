package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PARTY_THE_FISH extends SItem implements ItemStatistics, Museum {

    @Override
    public String getName() {
        return "Party the Fish";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Big fan of parties,","yet it's hard to","enjoy them without","friends.")); 
    }

    @Override
    public String getId() {
        return "PARTY_THE_FISH"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RAW_FISH;
    }

    @Override
    public byte getDurability() {
        return 2;
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
    public boolean isStackable() {
        return false;
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
