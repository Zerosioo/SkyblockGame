package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OCTOPUS_TENDRIL extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Octopus Tendril";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oSticks to the","§8§oskin and is hard","§8§oto pry off.")); 
    }

    @Override
    public String getId() {
        return "OCTOPUS_TENDRIL"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 1000000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTc0MDA3NTYzNTk4NiwKICAicHJvZmlsZUlkIiA6ICIzNmU5MTE1YzBjYzc0ZjhkOTdmOGFjNjA1ZGMxNGVkYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEYXJnaVYiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGJmNTgyODNmZmNhOGJkYzU5NDM2ZTgzZDk0ZTlmMTM0NDI2MzE2Yjk5YmFiNWI5YWY5MGRmZmRiMDgyYTA1NiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
