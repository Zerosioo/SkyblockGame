package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_HUGE_MUSHROOM_1 extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Enchanted Brown Mushroom Block";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_HUGE_MUSHROOM_1"; 
    }

    @Override
    public Material getMaterial() {
        return Material.HUGE_MUSHROOM_1;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public int getPrice() {
        return 51200;
    }

}
