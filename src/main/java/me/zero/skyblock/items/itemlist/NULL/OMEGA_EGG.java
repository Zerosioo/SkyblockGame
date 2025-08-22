package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OMEGA_EGG extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Omega Enchanted Egg";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "OMEGA_EGG"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MONSTER_EGG;
    }

    @Override
    public byte getDurability() {
        return 67;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
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
