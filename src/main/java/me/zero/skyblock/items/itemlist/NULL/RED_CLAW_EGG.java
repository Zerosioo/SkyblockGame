package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RED_CLAW_EGG extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Red Claw Egg";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RED_CLAW_EGG"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MONSTER_EGG;
    }

    @Override
    public byte getDurability() {
        return 96;
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

}
