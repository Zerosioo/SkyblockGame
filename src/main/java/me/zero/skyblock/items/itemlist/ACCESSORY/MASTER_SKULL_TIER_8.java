package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MASTER_SKULL_TIER_8 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Master Skull - Tier 8";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MASTER_SKULL_TIER_8"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDAyMjEyMzM0NiwKICAicHJvZmlsZUlkIiA6ICJkMDlkOTg1NzRiNjM0ZmNiOWNiN2I5MWZhYmE4ZGIzYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEdWNrVGVsbHoiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWM5MWY5YWZkODRmMjM2NWNlZThhNTNiNjFiOTQ0MmIyOGU0ZjBlMjViYzZiNmIxYmFkYmNkYWZjM2UzMGM0OSIKICAgIH0KICB9Cn0=";
    }

}
