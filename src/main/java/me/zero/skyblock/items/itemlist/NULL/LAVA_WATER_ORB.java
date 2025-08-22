package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAVA_WATER_ORB extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Lava Water Orb";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Extremely hot to the","touch.","","§8Shouldn't this be","§8steam..?")); 
    }

    @Override
    public String getId() {
        return "LAVA_WATER_ORB"; 
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
        return 5000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTc0MTE5MTY0MjExMCwKICAicHJvZmlsZUlkIiA6ICIxMjE4YWNiNDJiYzA0MzY4YjIxOTU4ZTZiYWU2NDMyMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJQYXRhdGplTUMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGM4MTI4Y2VlNDU3M2IyZjU1MTc3MTZlYzNlNzVhOGUwNjY2ZjNkNjBhNjUzZGY3YjQ4Y2I0YzU4MmZkODE3YSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
