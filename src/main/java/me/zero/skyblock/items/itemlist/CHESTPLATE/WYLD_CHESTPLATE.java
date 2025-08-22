package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WYLD_CHESTPLATE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Wyld Chain Top";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WYLD_CHESTPLATE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CHAINMAIL_CHESTPLATE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.CHESTPLATE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

}
