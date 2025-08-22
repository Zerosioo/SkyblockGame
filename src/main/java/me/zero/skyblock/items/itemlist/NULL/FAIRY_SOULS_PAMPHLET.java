package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FAIRY_SOULS_PAMPHLET extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "§dFairy Souls Pamphlet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FAIRY_SOULS_PAMPHLET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PAPER;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

}
