package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STARFALL extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Starfall";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oNo one knows how","§7§oand when the","§7§oStarfall","§7§oappeared. All we","§7§oknow is that it","§7§owas already","§7§othere when the","§7§oDwarves","§7§odiscovered the","§7§ocavern.")); 
    }

    @Override
    public String getId() {
        return "STARFALL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.NETHER_STAR;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 15;
    }

}
