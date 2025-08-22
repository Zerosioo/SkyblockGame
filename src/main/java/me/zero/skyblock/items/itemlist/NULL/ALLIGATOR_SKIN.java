package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ALLIGATOR_SKIN extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Alligator Skin";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7Harsh, jagged skin","§7that is rough to","§7the touch.")); 
    }

    @Override
    public String getId() {
        return "ALLIGATOR_SKIN"; 
    }

    @Override
    public Material getMaterial() {
        return Material.INK_SACK;
    }

    @Override
    public byte getDurability() {
        return 2;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 5000;
    }

}
