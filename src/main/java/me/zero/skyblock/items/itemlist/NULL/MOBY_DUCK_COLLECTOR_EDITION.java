package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MOBY_DUCK_COLLECTOR_EDITION extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Moby-Duck: Collector's Edition";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oA series of","§8§otales following","§8§oa fellow named","§8§oMoby and his","§8§owaterfowl best","§8§ofriend. Who","§8§owould be so","§8§oegregious as to","§8§othrust such a","§8§oliterary","§8§omasterpiece into","§8§othe sea?")); 
    }

    @Override
    public String getId() {
        return "MOBY_DUCK_COLLECTOR_EDITION"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOOK;
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
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public int getPrice() {
        return 1000000;
    }

}
