package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STAR_BOOTS extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Boots of the Stars";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STAR_BOOTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_BOOTS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.BOOTS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNOBTAINABLE;
    }

    @Override
    public int getHealth() {
        return 7500;
    }

    @Override
    public int getDefense() {
        return 2500;
    }

    @Override
    public int getIntelligence() {
        return 1000;
    }

}
