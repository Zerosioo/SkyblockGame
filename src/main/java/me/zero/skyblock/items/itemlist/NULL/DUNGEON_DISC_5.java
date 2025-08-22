package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DUNGEON_DISC_5 extends SItem implements ItemStatistics, Sellable, Museum {

    @Override
    public String getName() {
        return "Necron Disc";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DUNGEON_DISC_5"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_RECORD;
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
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
