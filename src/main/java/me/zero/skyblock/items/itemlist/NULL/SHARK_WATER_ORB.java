package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SHARK_WATER_ORB extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Shark Water Orb";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("A disgusting ball of","mushed shark matter.","","§8Are those teeth","§8sticking out?")); 
    }

    @Override
    public String getId() {
        return "SHARK_WATER_ORB"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzNTcwMzg3NDUzMCwKICAicHJvZmlsZUlkIiA6ICI0ZDEzZWUyZjViOWI0N2I2OGU2NzhhMjAxN2VmZTc1MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJCcmF5ZGVyZWsiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODg5MzcyYjYzZWE5MmUyOWQwM2MzNjJhNDZmY2ZjMjBkZDA1YWYzYTVlMjdjZDBkMWFiNDNkZjM3MWExNDIxNSIKICAgIH0KICB9Cn0=";
    }

}
