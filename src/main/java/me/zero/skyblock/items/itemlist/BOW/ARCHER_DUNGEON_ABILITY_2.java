package me.zero.skyblock.items.itemlist.BOW;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARCHER_DUNGEON_ABILITY_2 extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Stun Bow";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARCHER_DUNGEON_ABILITY_2"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOW;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.BOW;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
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
