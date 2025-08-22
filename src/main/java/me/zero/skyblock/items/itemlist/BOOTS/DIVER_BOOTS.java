package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIVER_BOOTS extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Diver's Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIVER_BOOTS"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public int getPrice() {
        return 10000;
    }

    @Override
    public int getSeaCreatureChance() {
        return 2;
    }

}
