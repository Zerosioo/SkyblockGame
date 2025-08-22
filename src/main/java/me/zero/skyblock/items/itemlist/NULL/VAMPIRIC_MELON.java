package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VAMPIRIC_MELON extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Vampiric Melon";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Perfect ingredient","for a healing melon.")); 
    }

    @Override
    public String getId() {
        return "VAMPIRIC_MELON"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MELON_BLOCK;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

}
