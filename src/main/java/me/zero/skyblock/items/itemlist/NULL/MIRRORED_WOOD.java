package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MIRRORED_WOOD extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "knalP dooW kaO";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MIRRORED_WOOD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WOOD;
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
