package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WEREWOLF_SKIN extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Werewolf Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WEREWOLF_SKIN"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

}
