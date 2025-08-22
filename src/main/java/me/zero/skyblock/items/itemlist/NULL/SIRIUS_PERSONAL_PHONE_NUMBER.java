package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SIRIUS_PERSONAL_PHONE_NUMBER extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Sirius' Personal Phone Number";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SIRIUS_PERSONAL_PHONE_NUMBER"; 
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
        return Rarity.LEGENDARY;
    }

}
