package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BROKEN_PIGGY_BANK extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Broken Piggy Bank";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BROKEN_PIGGY_BANK"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzkwMzk4MCwKICAicHJvZmlsZUlkIiA6ICI3NGEwMzQxNWY1OTI0ZTA4YjMyMGM2MmU1NGE3ZjJhYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNZXp6aXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjU5MDIwN2FlZWEyZDhmYzgwMTk0ZjJhMTA5ZjViMTk5OWM5MWViZDM3N2RmZjAxYjllN2ViZTA5MWEzYTQxOSIKICAgIH0KICB9Cn0=";
    }

}
