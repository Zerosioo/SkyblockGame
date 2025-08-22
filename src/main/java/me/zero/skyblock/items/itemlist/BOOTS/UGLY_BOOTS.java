package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UGLY_BOOTS extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Ugly Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "UGLY_BOOTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_BOOTS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.BOOTS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.MYTHIC;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(51,51,255);
    }

}
