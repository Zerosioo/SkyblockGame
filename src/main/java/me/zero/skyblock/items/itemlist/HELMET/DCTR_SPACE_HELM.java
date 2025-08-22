package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DCTR_SPACE_HELM extends SItem implements ItemStatistics, Museum {

    @Override
    public String getName() {
        return "Space Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DCTR_SPACE_HELM"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STAINED_GLASS;
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

}
