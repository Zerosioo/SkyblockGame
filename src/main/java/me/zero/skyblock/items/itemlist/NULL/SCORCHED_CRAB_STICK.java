package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SCORCHED_CRAB_STICK extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Scorched Crab Stick";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7Sometimes,","§7well-done just","§7isn't enough.")); 
    }

    @Override
    public String getId() {
        return "SCORCHED_CRAB_STICK"; 
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
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 25000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczOTY2NDM5MjE1OCwKICAicHJvZmlsZUlkIiA6ICI3YTVkYmRlNDk0NWU0YTE4Yjg2OWY1MGY1NTJjNjlkYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJCdWtraXRBUEkiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjhiOWQ2ZWE3MGJlMTBlMjIyNTRkYjA3ZjQ4MjhhNDlmMzlhZTVkMDgyZDg5MzZiOWI0NzI5OTAxYzk4MmRjYSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
