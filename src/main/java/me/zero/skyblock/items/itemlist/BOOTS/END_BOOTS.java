package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class END_BOOTS extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Ender Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "END_BOOTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CHAINMAIL_BOOTS;
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
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 10000;
    }

    @Override
    public int getHealth() {
        return 15;
    }

    @Override
    public int getDefense() {
        return 25;
    }

}
