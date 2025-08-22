package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COCONUT_DRINK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Coconut Drink";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "COCONUT_DRINK"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5MjA5ODQ1Nzk1NiwKICAicHJvZmlsZUlkIiA6ICJhNzFjNTQ5MmQwNTE0ZDg3OGFiOTEwZmRmZmRmYzgyZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJBcHBsZTU0NDciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTQwM2VlYjg4YWMyYWU1NmFmYjFhZWI3MzIyZWEwNjdiNjc2NTc2Y2UzNzY4N2Y1YTM5ZmM1NWU5Yjc1Mjg1OCIKICAgIH0KICB9Cn0=";
    }

}
