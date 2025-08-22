package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MIRRORED_SLIME_BALL extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "llabemilS";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MIRRORED_SLIME_BALL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SLIME_BALL;
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
