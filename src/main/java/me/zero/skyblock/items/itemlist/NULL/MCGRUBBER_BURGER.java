package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MCGRUBBER_BURGER extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "McGrubber's Burger";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MCGRUBBER_BURGER"; 
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
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1MTE2Mzc3MTMxMCwKICAicHJvZmlsZUlkIiA6ICJkZjY2OWIyOGFmNWE0MTNjODFhNjcwOGQ0ZDIyM2FlNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJsYW5nX3FpbmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDMzZGRiOTJjYjZiM2E3OTI4MGI4YmRjZWQ4OTc2YWVhYjEzYTRiZmZlYWVmMmQ0NmQ4MjhiZDkxZGVlMGYzZSIKICAgIH0KICB9Cn0=";
    }

}
