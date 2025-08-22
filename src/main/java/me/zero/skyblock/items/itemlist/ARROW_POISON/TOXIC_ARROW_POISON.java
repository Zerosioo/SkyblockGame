package me.zero.skyblock.items.itemlist.ARROW_POISON;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TOXIC_ARROW_POISON extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Toxic Arrow Poison";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TOXIC_ARROW_POISON"; 
    }

    @Override
    public Material getMaterial() {
        return Material.INK_SACK;
    }

    @Override
    public byte getDurability() {
        return 10;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.ARROW_POISON;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 2000;
    }

}
