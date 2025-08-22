package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DUNGEON_CHEST_KEY extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Dungeon Chest Key";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DUNGEON_CHEST_KEY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.TRIPWIRE_HOOK;
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
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
