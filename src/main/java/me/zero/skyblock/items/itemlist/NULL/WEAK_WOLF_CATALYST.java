package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WEAK_WOLF_CATALYST extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Weak Wolf Catalyst";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WEAK_WOLF_CATALYST"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BONE;
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

}
