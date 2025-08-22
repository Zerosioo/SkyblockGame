package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KEY_TO_KAT_SOUL extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Key to Infested House Soul";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Hold this item in","your inventory to","use the soul in the","infested house.")); 
    }

    @Override
    public String getId() {
        return "KEY_TO_KAT_SOUL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_NUGGET;
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

}
