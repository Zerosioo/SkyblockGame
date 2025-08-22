package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REFORGE_ANVIL extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Reforge Anvil";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REFORGE_ANVIL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ANVIL;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

}
