package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GRAVITY_TALISMAN extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Gravity Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GRAVITY_TALISMAN"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 864;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMjAzNzU0Mjc1MywKICAicHJvZmlsZUlkIiA6ICJiNzQ3OWJhZTI5YzQ0YjIzYmE1NjI4MzM3OGYwZTNjNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTeWxlZXgiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjE2ZjRhYzhhMDY5OGFiMDdiYjBhNWVmNjlkYzA4ZGFlZGQ4ZjU5NzJlN2ExMjM3YzhjNTYzNjFlM2YyMDRjYSIKICAgIH0KICB9Cn0=";
    }

}
