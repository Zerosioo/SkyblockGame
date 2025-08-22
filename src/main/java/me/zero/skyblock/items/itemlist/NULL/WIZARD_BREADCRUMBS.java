package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WIZARD_BREADCRUMBS extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "%%yellow%%Wizard's Breadcrumbs";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WIZARD_BREADCRUMBS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GLOWSTONE_DUST;
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
