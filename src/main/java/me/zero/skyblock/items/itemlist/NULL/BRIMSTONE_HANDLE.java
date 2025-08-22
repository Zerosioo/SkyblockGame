package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BRIMSTONE_HANDLE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Brimstone Handle";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7A splendid handle","§7belonging to a","§7feared foe. In","§7exchange for","§7granting them","§7immense power, it","§7saps the life","§7force from its","§7wielder.")); 
    }

    @Override
    public String getId() {
        return "BRIMSTONE_HANDLE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STICK;
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
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public int getPrice() {
        return 25000;
    }

}
