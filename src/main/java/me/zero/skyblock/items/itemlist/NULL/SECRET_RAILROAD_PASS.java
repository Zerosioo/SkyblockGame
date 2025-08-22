package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SECRET_RAILROAD_PASS extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Secret Railroad Pass";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8Quest Item","§8","§8§7Show this pass","§7to the §bTicket","§bMaster§7.")); 
    }

    @Override
    public String getId() {
        return "SECRET_RAILROAD_PASS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PAPER;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
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
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

}
