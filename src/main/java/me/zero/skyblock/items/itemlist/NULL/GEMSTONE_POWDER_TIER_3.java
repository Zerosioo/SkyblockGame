package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GEMSTONE_POWDER_TIER_3 extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "X Gemstone Powder";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GEMSTONE_POWDER_TIER_3"; 
    }

    @Override
    public Material getMaterial() {
        return Material.INK_SACK;
    }

    @Override
    public byte getDurability() {
        return 14;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

}
