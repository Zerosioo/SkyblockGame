package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FEL_ROSE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Fel Rose";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FEL_ROSE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RED_ROSE;
    }

    @Override
    public byte getDurability() {
        return 1;
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
    public boolean isDungeonItem() {
      	return true;
    }

}
