package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DEADGEHOG_SPINE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Deadgehog Spine";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Contrary to popular","belief, Deadgehogs","aren't rodents.","","They are in fact","mangled wraith","remnants of warriors","who couldn't find","true love.")); 
    }

    @Override
    public String getId() {
        return "DEADGEHOG_SPINE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ARROW;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

}
