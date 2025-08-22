package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POORLY_WRAPPED_ROCK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Poorly Wrapped Rock";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oUneven, unkempt,","§7§odisjointed, and","§7§othat's just the","§7§oguy who wrapped","§7§oit!")); 
    }

    @Override
    public String getId() {
        return "POORLY_WRAPPED_ROCK"; 
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
        return Rarity.COMMON;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzNzQ3NTIzMzg3OSwKICAicHJvZmlsZUlkIiA6ICI0ZDEzZWUyZjViOWI0N2I2OGU2NzhhMjAxN2VmZTc1MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJCcmF5ZGVyZWsiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWY5Yzg1MjY4MmRiMzA2M2M4MzkwODM5YjlmNGNhMTY3MGEwNzIyNmNhMGE0YTkwMmYxZDlmMDZiMjMzYzQwIgogICAgfQogIH0KfQ==";
    }

}
