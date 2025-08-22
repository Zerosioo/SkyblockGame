package me.zero.skyblock.items.itemlist.DEPLOYABLE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ALERT_FLARE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Alert Flare";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ALERT_FLARE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FIREWORK;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.DEPLOYABLE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.PROFESSIONAL;
    }

}
