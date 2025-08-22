package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PITCHIN_KOI extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Pitchin' Koi";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PITCHIN_KOI"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 22222;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNjc3MDExOTQ3OSwKICAicHJvZmlsZUlkIiA6ICIwMmUxNTM0NTg2Yzc0N2E3YTM5YjdlNGRhY2E2OWJhNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJLb2kiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmI2YjhjZWRmZWFkNDI4NmY2YzBiYmEzMmJiZDM2NWQyYThjYTJmMWVhY2Q3YjlkOTUxNDc0MTdkYmJhZTlkNCIKICAgIH0KICB9Cn0=";
    }

}
