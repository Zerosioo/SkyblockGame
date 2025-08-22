package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PARKOUR_CONTROLLER extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Parkour Start/End";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PARKOUR_CONTROLLER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_PLATE;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

}
