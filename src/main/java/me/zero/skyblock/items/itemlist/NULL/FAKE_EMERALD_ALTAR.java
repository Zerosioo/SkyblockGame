package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FAKE_EMERALD_ALTAR extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "§aFake Emerald Altar";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oCan't bring the","§7§ogirl to the","§7§oaltar? Bring the","§7§oaltar to the","§7§ogirl!")); 
    }

    @Override
    public String getId() {
        return "FAKE_EMERALD_ALTAR"; 
    }

    @Override
    public Material getMaterial() {
        return Material.EMERALD_BLOCK;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

}
