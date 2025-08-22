package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHOCOLATE_CHIP extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Fang-tastic Chocolate Chip";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CHOCOLATE_CHIP"; 
    }

    @Override
    public Material getMaterial() {
        return Material.COOKIE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 10000;
    }

}
