package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ELEANOR_TROUSERS extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Eleanor's Trousers";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oThese trousers","§8§oboast exquisite","§8§ofabric, offering","§8§oboth comfort and","§8§oa polished look.")); 
    }

    @Override
    public String getId() {
        return "ELEANOR_TROUSERS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_LEGGINGS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.LEGGINGS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(255,215,0);
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getRiftTime() {
        return 20;
    }

}
