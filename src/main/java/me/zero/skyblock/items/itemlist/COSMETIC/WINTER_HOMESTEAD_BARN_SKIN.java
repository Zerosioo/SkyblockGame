package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WINTER_HOMESTEAD_BARN_SKIN extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Winter Homestead Barn Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WINTER_HOMESTEAD_BARN_SKIN"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PACKED_ICE;
    }

    @Override
    public byte getDurability() {
        return 2;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

}
