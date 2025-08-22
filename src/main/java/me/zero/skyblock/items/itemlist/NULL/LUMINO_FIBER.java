package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LUMINO_FIBER extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Lumino Fiber";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oChanges color","§7§obased on the","§7§oangle you look","§7§oat it.")); 
    }

    @Override
    public String getId() {
        return "LUMINO_FIBER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STRING;
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
        return 500;
    }

}
