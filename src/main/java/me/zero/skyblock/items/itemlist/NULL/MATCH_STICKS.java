package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MATCH_STICKS extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Match-Sticks";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oThe head of","§7§oMatchos is a","§7§ocombination of","§7§oSulphur and a","§7§ocrystalline","§7§osubstance. With","§7§oeven the","§7§oslightest","§7§ofrictions they","§7§owill light up.")); 
    }

    @Override
    public String getId() {
        return "MATCH_STICKS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.REDSTONE_TORCH_ON;
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
    public int getPrice() {
        return 10;
    }

}
