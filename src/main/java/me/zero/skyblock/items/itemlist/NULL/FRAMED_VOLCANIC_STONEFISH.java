package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FRAMED_VOLCANIC_STONEFISH extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Framed Volcanic Stonefish";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FRAMED_VOLCANIC_STONEFISH"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ITEM_FRAME;
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
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

}
