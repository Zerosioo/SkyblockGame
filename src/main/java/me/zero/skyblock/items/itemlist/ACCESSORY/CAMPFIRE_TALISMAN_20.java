package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CAMPFIRE_TALISMAN_20 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Campfire Scion Badge";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CAMPFIRE_TALISMAN_20"; 
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
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTQ2NjQyODI5MSwKICAicHJvZmlsZUlkIiA6ICIxZGI3ZjUxYWZmOWM0NTcyOGZmNmU5MjMxMmZhZGZkOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJsdXNtZW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTg2NDRjMDlhNDgwMGRiNjVhNmE4MzQyMmFiNDhmMDg2MTliYWVjNTZmMmUzNTcwYTI4OGY2YThkYjBhMjIyOCIKICAgIH0KICB9Cn0=";
    }

}
