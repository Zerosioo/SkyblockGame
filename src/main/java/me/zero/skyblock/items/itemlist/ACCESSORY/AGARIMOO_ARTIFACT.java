package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AGARIMOO_ARTIFACT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Agarimoo Artifact";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "AGARIMOO_ARTIFACT"; 
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
        return Rarity.RARE;
    }

    @Override
    public int getFishingSpeed() {
        return 3;
    }

    @Override
    public int getFarmingWisdom() {
        return 1;
    }

    @Override
    public int getFishingWisdom() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3OTc3MzQ2NjI3NCwKICAicHJvZmlsZUlkIiA6ICJhYzIzZmEzNzRhMmM0YjU2YmYzYzU2ZTVhODY3NjIzNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJxdWVlbnNoYW5pd2EiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2YzMTMwNDY4YWM0ODBhNDI3ZGIxM2FkMTNlOGNhODUyNmI1MzhhYjdhZDdkNjlmYzk5NTJmM2M1M2FlYThkMSIKICAgIH0KICB9Cn0=";
    }

}
