package me.zero.skyblock.items.itemlist.SPADE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PROMISING_SPADE extends SItem implements ItemStatistics, Sellable, Museum {

    @Override
    public String getName() {
        return "Promising Shovel";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PROMISING_SPADE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_SPADE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.SPADE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.STARTER;
    }

    @Override
    public int getPrice() {
        return 10;
    }

}
