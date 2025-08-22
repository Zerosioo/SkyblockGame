package me.zero.skyblock.items.itemlist.PICKAXE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ALPHA_PICK extends SItem implements ItemStatistics, Museum {

    @Override
    public String getName() {
        return "Pioneer Pickaxe";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oThe very first","§7§opickaxe model!","§7§oInvented by the","§7§ofamous Thomas","§7§oPickson.")); 
    }

    @Override
    public String getId() {
        return "ALPHA_PICK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WOOD_PICKAXE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.PICKAXE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getMiningSpeed() {
        return 1;
    }

}
