package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAGIC_8_BALL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Magic 8 Ball";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MAGIC_8_BALL"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxMzMxODQ4MzY1MiwKICAicHJvZmlsZUlkIiA6ICIzZWIxZDExYWE5NDU0YTZjODU5NWVhNWExZjg4ZjA0OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEZWl2aWNpdG9fRWMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGYyNDEyZDYzZGQyZTBlMjMyMjMwYWJkMDRhOGY3MjZlNTFjOTNhNzI2ODZjN2RhZTE3MjJjNDY3N2Y5ZjU0OCIKICAgIH0KICB9Cn0=";
    }

}
