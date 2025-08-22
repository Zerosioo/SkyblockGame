package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TRIO_CONTACTS_ADDON extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Abiphone Contacts Trio";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TRIO_CONTACTS_ADDON"; 
    }

    @Override
    public Material getMaterial() {
        return Material.REDSTONE_COMPARATOR;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

}
