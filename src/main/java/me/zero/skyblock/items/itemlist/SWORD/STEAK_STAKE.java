package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STEAK_STAKE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Steak Stake";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STEAK_STAKE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.COOKED_MUTTON;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.SWORD;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

}
