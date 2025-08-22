package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WIKI_JOURNAL extends SItem implements ItemStatistics, Museum {

    @Override
    public String getName() {
        return "Wiki Journal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WIKI_JOURNAL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOOK;
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
    public boolean isStackable() {
        return false;
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
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

}
