package me.zero.skyblock.items.itemlist.FISHING_ROD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CARNIVAL_FISHING_ROD extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Carnival Rod";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7Used to catch","§7§3fish §7in the","§7§3Catch a Fish","§3§7game.")); 
    }

    @Override
    public String getId() {
        return "CARNIVAL_FISHING_ROD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FISHING_ROD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.FISHING_ROD;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

}
