package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SUPER_LEECH_MODIFIER extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Super Leech Modifier";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7Can be combined","§7with an §9Aspect","§9of the Leech §7in","§7a Crafting Table","§7to increase its","§7range from §a4","§ablocks §7to §a5","§ablocks §7and","§7decrease its","§7§bMana Cost §7from","§7§b60 §7to §b50§7.")); 
    }

    @Override
    public String getId() {
        return "SUPER_LEECH_MODIFIER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SLIME_BLOCK;
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
