package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GHAST_CHESTPLATE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Ghast Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GHAST_CHESTPLATE"; 
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
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 3200;
    }

    @Override
    public int getHealth() {
        return 200;
    }

}
