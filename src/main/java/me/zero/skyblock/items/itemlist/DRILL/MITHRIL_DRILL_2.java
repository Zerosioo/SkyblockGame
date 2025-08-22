package me.zero.skyblock.items.itemlist.DRILL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MITHRIL_DRILL_2 extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Mithril Drill SX-R326";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MITHRIL_DRILL_2"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PRISMARINE_SHARD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.DRILL;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public int getPrice() {
        return 29000;
    }

    @Override
    public int getDamage() {
        return 65;
    }

    @Override
    public int getMiningFortune() {
        return 20;
    }

    @Override
    public int getMiningSpeed() {
        return 600;
    }

}
