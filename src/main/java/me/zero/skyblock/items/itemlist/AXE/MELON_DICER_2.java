package me.zero.skyblock.items.itemlist.AXE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MELON_DICER_2 extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Melon Dicer 2.0";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§oSame as the Melon","§oDicer 1.0, just","§obetter!")); 
    }

    @Override
    public String getId() {
        return "MELON_DICER_2"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_AXE;
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
