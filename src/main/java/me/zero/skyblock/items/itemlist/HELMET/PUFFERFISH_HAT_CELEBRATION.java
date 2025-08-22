package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PUFFERFISH_HAT_CELEBRATION extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Pufferfish Hat";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PUFFERFISH_HAT_CELEBRATION"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getStrength() {
        return 10;
    }

    @Override
    public int getHealth() {
        return 20;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5MjA5OTYyMDY3MCwKICAicHJvZmlsZUlkIiA6ICIzZmM3ZmRmOTM5NjM0YzQxOTExOTliYTNmN2NjM2ZlZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJZZWxlaGEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDRmN2YyMjAzZTNhODUwYjZjODNkY2U0N2ZkNjcxNGE2MmU0ZDc2NDhjMTZlZDFmZDlkYzgxNjhhYjNjNDg0ZiIKICAgIH0KICB9Cn0=";
    }

}
