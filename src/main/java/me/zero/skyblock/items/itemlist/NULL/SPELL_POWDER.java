package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPELL_POWDER extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Spell Powder";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oLooks like","§7§oSulphur, smells","§7§olike Sulphur...","§7§oSuspicious.")); 
    }

    @Override
    public String getId() {
        return "SPELL_POWDER"; 
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
        return Rarity.EPIC;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public int getPrice() {
        return 500;
    }

}
