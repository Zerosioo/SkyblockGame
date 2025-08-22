package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TURBOMAX_VACUUM extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Turbomax Vacuum Cleaner";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TURBOMAX_VACUUM"; 
    }

    @Override
    public Material getMaterial() {
        return Material.HOPPER_MINECART;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

}
