package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ANTI_BITE_SCARF_2 extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Anti-Bite Scarf";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ANTI_BITE_SCARF_2"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CARPET;
    }

    @Override
    public byte getDurability() {
        return 14;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.MYTHIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

}
