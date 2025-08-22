package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BIOFUEL extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Biofuel";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§o100% renewable","§7§oenergy!")); 
    }

    @Override
    public String getId() {
        return "BIOFUEL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.INK_SACK;
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
        return Rarity.RARE;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public int getPrice() {
        return 10000;
    }

}
