package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MINING_RAFFLE_TICKET extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Raffle Ticket";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MINING_RAFFLE_TICKET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.NAME_TAG;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

}
