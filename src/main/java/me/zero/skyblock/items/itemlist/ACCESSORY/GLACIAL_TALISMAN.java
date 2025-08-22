package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GLACIAL_TALISMAN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Glacial Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GLACIAL_TALISMAN"; 
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
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNjU2NzUwODYyNSwKICAicHJvZmlsZUlkIiA6ICJkM2Y5MjEyMjY3YzM0YzEwYWNjOWZkNGI5MDFkYjI0ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJpdHNibGFtaXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2I4ZjRhNjg4NDU2MjJiODBjYWY3YWM5MjRkNDhiYWZhZWZjODE5YzQ3YzY3ZjkzOTc4YTA5YmMwODI5ODNmZiIKICAgIH0KICB9Cn0=";
    }

}
