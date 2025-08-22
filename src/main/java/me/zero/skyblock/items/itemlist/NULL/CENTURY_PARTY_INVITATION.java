package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CENTURY_PARTY_INVITATION extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Century Party Invitation";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CENTURY_PARTY_INVITATION"; 
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

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

}
