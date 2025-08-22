package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAGMAG extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Magmag";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oUsed in love","§7§opotions, and","§7§olaxatives.")); 
    }

    @Override
    public String getId() {
        return "MAGMAG"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SKULL_ITEM;
    }

    @Override
    public byte getDurability() {
        return 3;
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
    public int getPrice() {
        return 50;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NzE2OTEwOTMxOTAsInByb2ZpbGVJZCI6IjVkZTZlMTg0YWY4ZDQ5OGFiYmRlMDU1ZTUwNjUzMzE2IiwicHJvZmlsZU5hbWUiOiJBc3Nhc2luSmlhbmVyMjUiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzdiMmQ1MjM1MjA4ZTFlNzAxYzBmNTQ3ZDQyZWRhOWYzNTdkNzI3YTkzNGExYzllZTNmZTIyYTI5NDBlZDljZTIifX19";
    }

}
