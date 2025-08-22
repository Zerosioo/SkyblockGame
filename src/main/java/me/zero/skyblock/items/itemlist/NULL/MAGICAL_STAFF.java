package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAGICAL_STAFF extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Magical Staff";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MAGICAL_STAFF"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BLAZE_ROD;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 27;
    }

    @Override
    public int getDamage() {
        return 20;
    }

}
