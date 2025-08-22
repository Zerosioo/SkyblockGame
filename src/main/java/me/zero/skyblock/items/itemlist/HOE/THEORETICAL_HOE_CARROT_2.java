package me.zero.skyblock.items.itemlist.HOE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class THEORETICAL_HOE_CARROT_2 extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Gauss Carrot Hoe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "THEORETICAL_HOE_CARROT_2"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_HOE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HOE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

}
