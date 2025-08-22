package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WINTER_WATER_ORB extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Winter Water Orb";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("A collection of","frozen substances,","potentially","including ice cream.")); 
    }

    @Override
    public String getId() {
        return "WINTER_WATER_ORB"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjQzMzU1OSwKICAicHJvZmlsZUlkIiA6ICJlODhjMjBiOTUyMTA0NTA0OThkMDU4OTA5ODVhOTQ2OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTY2huZWxsZXJUYWc0MjciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTYwYTg3NWY1N2UzNjcwMDdmMmMxY2YwMDc3N2NiNDFmOTBlZmUyMDdmMDM5Y2MyOWQ3NmI1OGI4ZDg1MTJkIgogICAgfQogIH0KfQ==";
    }

}
