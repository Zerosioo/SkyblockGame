package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOOTS_OF_THE_PACK extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Boots of the Pack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BOOTS_OF_THE_PACK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_BOOTS;
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
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public int getHealth() {
        return 50;
    }

    @Override
    public int getDefense() {
        return 45;
    }

}
