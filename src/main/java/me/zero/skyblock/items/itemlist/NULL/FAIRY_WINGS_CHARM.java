package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FAIRY_WINGS_CHARM extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Fairy Wing's Charm";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FAIRY_WINGS_CHARM"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTU0MTA1NTA4NCwKICAicHJvZmlsZUlkIiA6ICI1OGZmZWI5NTMxNGQ0ODcwYTQwYjVjYjQyZDRlYTU5OCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTa2luREJuZXQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGNhZWQwMzVjNzYxNjNmYWVmOTg5NWE3YmIwYTdjNTRlMTg2YTFlZTI5MGU2NTZjOWI2MDFhNTIzYWYzMTA3MSIKICAgIH0KICB9Cn0=";
    }

}
