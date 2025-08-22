package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CANCEL_PARKOUR_ITEM extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Cancel Parkour";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CANCEL_PARKOUR_ITEM"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STAINED_CLAY;
    }

    @Override
    public byte getDurability() {
        return 14;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

}
