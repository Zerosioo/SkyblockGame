package me.zero.skyblock.items.itemlist.AXE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MELON_DICER_3 extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Melon Dicer 3.0";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§oAlmost identical","§oto the Melon Dicer","§o2.0, but it has","§o3.0 in the name!")); 
    }

    @Override
    public String getId() {
        return "MELON_DICER_3"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

}
