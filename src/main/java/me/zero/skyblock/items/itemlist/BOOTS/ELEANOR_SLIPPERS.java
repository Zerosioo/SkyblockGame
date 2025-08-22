package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ELEANOR_SLIPPERS extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Eleanor's Slippers";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oMade from the","§8§osoftest","§8§omaterials, these","§8§oslippers are as","§8§ostylish as they","§8§oare serene.")); 
    }

    @Override
    public String getId() {
        return "ELEANOR_SLIPPERS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_BOOTS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.BOOTS;
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
