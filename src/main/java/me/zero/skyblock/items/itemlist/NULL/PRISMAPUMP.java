package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PRISMAPUMP extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Prismapump";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PRISMAPUMP"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PRISMARINE;
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

}
