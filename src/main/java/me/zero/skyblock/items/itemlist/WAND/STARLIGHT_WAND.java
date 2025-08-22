package me.zero.skyblock.items.itemlist.WAND;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STARLIGHT_WAND extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Starlight Wand";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STARLIGHT_WAND"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STICK;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.WAND;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.AMATEUR;
    }

    @Override
    public int getPrice() {
        return 15000;
    }

}
