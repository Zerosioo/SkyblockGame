package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BAYOU_WATER_ORB extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Bayou Water Orb";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("A green mass of","coagulated swamp.")); 
    }

    @Override
    public String getId() {
        return "BAYOU_WATER_ORB"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTc0MTE5MTYwMjMyOSwKICAicHJvZmlsZUlkIiA6ICJlNzdlMDRhNmMyMzg0MGVmODZlOGViOWY4NGQ3OWVjNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJMT1JJU0pUMTYiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQ4NjMwZDNhODE2ZjA4NGI5OTAwMzk5ODEzZTJiNzM2YmJkNGEwMjE5MjZjNmNlNTBkNDRlNjdkZmI2ZDc5YSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
