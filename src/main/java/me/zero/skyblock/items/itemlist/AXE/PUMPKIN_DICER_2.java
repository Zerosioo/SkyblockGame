package me.zero.skyblock.items.itemlist.AXE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PUMPKIN_DICER_2 extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Pumpkin Dicer 2.0";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§oSomeone once said,","§o2 is always better","§othan 1!")); 
    }

    @Override
    public String getId() {
        return "PUMPKIN_DICER_2"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_AXE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.AXE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

}
