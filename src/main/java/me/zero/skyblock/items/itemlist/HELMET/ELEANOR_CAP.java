package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ELEANOR_CAP extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Eleanor's Cap";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oDelicately","§8§ocrafted from the","§8§ofinest enchanted","§8§osilk, this cap","§8§ocombines","§8§oelegance with","§8§osubtlety.")); 
    }

    @Override
    public String getId() {
        return "ELEANOR_CAP"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_HELMET;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HELMET;
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
