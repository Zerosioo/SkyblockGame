package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SULPHUR_ORE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Sulphur";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§o\"Give me some","§7§oSulphur and I'll","§7§omake a wand.","§7§oGive me all the","§7§oSulphur and I'll","§7§oconquer the","§7§oworld.\" -","§7§oUnnamed Mage.")); 
    }

    @Override
    public String getId() {
        return "SULPHUR_ORE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GLOWSTONE_DUST;
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
        return 10;
    }

}
