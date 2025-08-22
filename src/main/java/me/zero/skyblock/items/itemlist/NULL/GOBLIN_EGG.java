package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOBLIN_EGG extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Goblin Egg";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oWhat came first","§7§othe goblin or","§7§othe egg?")); 
    }

    @Override
    public String getId() {
        return "GOBLIN_EGG"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MONSTER_EGG;
    }

    @Override
    public byte getDurability() {
        return 4;
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
    public int getPrice() {
        return 421;
    }

}
