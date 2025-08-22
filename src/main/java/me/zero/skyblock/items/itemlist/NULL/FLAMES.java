package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLAMES extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Flames";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oSome say that","§7§othe same","§7§osubstance can be","§7§ofound in the","§7§oabdomen of","§7§oDragons,","§7§oallowing them to","§7§obreathe fire.","§7§oCinderbats are","§7§omuch cuter","§7§othough.")); 
    }

    @Override
    public String getId() {
        return "FLAMES"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BLAZE_POWDER;
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
        return 200;
    }

}
