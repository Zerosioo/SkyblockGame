package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EXCEEDINGLY_COMFY_SNEAKERS extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Exceedingly Comfy Sneakers";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Stay classy.")); 
    }

    @Override
    public String getId() {
        return "EXCEEDINGLY_COMFY_SNEAKERS"; 
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
        return Rarity.EPIC;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(56,0,36);
    }

}
