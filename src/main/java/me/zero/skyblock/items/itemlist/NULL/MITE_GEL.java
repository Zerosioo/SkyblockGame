package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MITE_GEL extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Mite Gel";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oSticky goo","§8§oscraped off an","§8§oEndermite.")); 
    }

    @Override
    public String getId() {
        return "MITE_GEL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.INK_SACK;
    }

    @Override
    public byte getDurability() {
        return 5;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 2000;
    }

}
