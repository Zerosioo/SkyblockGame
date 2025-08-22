package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_HARD_STONE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Enchanted Hard Stone";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7A refined form of","§7heavy rock from","§7the darkest","§7depths.")); 
    }

    @Override
    public String getId() {
        return "ENCHANTED_HARD_STONE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STONE;
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
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public int getPrice() {
        return 576;
    }

}
