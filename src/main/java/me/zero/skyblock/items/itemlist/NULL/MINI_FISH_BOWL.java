package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MINI_FISH_BOWL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Mini Fish Bowl";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8Decoration item","§8","§8§7Obtained during","§7the §eCarnival§7","§7for placing within","§7the §aTop 500 §7in","§7§3Catch a Fish§7.")); 
    }

    @Override
    public String getId() {
        return "MINI_FISH_BOWL"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA1Mjk2NTQ0NiwKICAicHJvZmlsZUlkIiA6ICJjYzU2NjAzYmZiZjg0OGJmOTM3MzY1N2VjYzUyNGI4NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJpc2FhYWFhYV8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQ5NDg4Y2NjOWM5NGYxNGFmYjc1NzQxODYwZWFmODBmNGNlY2I0ZTdkYjE3ODdjOWRiNzRjNjYxMzBmYWYzZCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
