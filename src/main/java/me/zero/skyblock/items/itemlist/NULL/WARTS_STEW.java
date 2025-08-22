package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WARTS_STEW extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "§cMushroom & Warts Stew";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oMade with love,","§7§oand an array of","§7§oslightly more","§7§oquestionable","§7§oingredients.")); 
    }

    @Override
    public String getId() {
        return "WARTS_STEW"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RABBIT_STEW;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

}
