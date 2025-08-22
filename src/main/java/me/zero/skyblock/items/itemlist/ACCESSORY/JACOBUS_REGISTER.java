package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JACOBUS_REGISTER extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Jacobus Register";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JACOBUS_REGISTER"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public int getHealth() {
        return 10;
    }

    @Override
    public int getPetLuck() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzMjcyMDEyMTg2NCwKICAicHJvZmlsZUlkIiA6ICJiNjc3NTgwYzExYmU0ZjNiODI1OGM0YjBkNzNhNzg0ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJPZmZpY2lhbGx5SksiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I2NDhiOWE0NGUyODBiY2RmMjVmNGE2NmE5N2JkNWMzMzU0MmU1ZTgyNDE1ZTE1YjQ3NWM2Yjk5OWI4ZDYzNSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
