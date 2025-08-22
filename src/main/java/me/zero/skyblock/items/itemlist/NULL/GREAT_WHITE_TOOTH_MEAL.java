package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GREAT_WHITE_TOOTH_MEAL extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Great White Tooth Meal";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("It smells like blood","and fear.")); 
    }

    @Override
    public String getId() {
        return "GREAT_WHITE_TOOTH_MEAL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.INK_SACK;
    }

    @Override
    public byte getDurability() {
        return 15;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 12000;
    }

}
