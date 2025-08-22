package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HERMIT_CRAB_PERSONALITY extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Hermit Crab Minion Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HERMIT_CRAB_PERSONALITY"; 
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
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5MTgxMzY2ODU2NCwKICAicHJvZmlsZUlkIiA6ICIxOTI1MjFiNGVmZGI0MjVjODkzMWYwMmE4NDk2ZTExYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTZXJpYWxpemFibGUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTI5ZGQ2OWRjNmQ1YzlmMTAzNjFkMzVmZWE1MDE2NWIwYWJjZmFiMDIzMGQ1ODhlYjlkNmUyYTY4ZDhjMzBkMyIKICAgIH0KICB9Cn0=";
    }

}
