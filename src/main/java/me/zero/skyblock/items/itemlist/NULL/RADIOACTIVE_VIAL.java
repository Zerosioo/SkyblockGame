package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RADIOACTIVE_VIAL extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Radioactive Vial";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RADIOACTIVE_VIAL"; 
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
        return Rarity.MYTHIC;
    }

    @Override
    public int getPrice() {
        return 100000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDA0OTczMzc3OSwKICAicHJvZmlsZUlkIiA6ICIxOTI1MjFiNGVmZGI0MjVjODkzMWYwMmE4NDk2ZTExYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTZXJpYWxpemFibGUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWI1NzRjMDNiMWM4ZjUyNTM1Zjk2YTIwYTQxNzYwMjBiYjI4MGUwYWY1MmZjMTI4NWQzZWNiZDM1MTcyODBjNCIKICAgIH0KICB9Cn0=";
    }

}
