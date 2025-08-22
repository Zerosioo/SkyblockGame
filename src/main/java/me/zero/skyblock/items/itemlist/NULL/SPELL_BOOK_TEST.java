package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPELL_BOOK_TEST extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Spellbook";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SPELL_BOOK_TEST"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ENCHANTED_BOOK;
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
    public int getPrice() {
        return 1;
    }

}
