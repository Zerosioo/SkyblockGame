package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COLLECTION_DISPLAY extends SItem implements ItemStatistics, Museum {

    @Override
    public String getName() {
        return "Collection Display";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7Show off your","§7collection","§7progress!")); 
    }

    @Override
    public String getId() {
        return "COLLECTION_DISPLAY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.HAY_BLOCK;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

}
