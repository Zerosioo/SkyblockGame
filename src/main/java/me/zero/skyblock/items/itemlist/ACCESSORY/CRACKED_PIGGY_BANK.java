package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CRACKED_PIGGY_BANK extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Cracked Piggy Bank";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CRACKED_PIGGY_BANK"; 
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
        return 16000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjYzMjA4NCwKICAicHJvZmlsZUlkIiA6ICI2NmRmYzFmNTRlNTU0ZTZmODJjNTA5ZjM1NTJiYTkwZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJadWFyaWciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTRhN2FhYzA4NTkzYTFhMGJjNjY2NmZlMGFlZWRmYjE5NWQ0MTNmYzljZjg3YzczZjRhOGMwNGRhNjQxODg1NyIKICAgIH0KICB9Cn0=";
    }

}
