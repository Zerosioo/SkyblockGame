package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLACK_WOOLEN_YARN extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Black Woolen Yarn";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BLACK_WOOLEN_YARN"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WOOL;
    }

    @Override
    public byte getDurability() {
        return 15;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

}
