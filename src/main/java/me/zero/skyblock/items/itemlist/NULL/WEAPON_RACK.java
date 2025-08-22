package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WEAPON_RACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Weapon Rack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WEAPON_RACK"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NTk3MzMyNCwKICAicHJvZmlsZUlkIiA6ICI0ZTMwZjUwZTdiYWU0M2YzYWZkMmE3NDUyY2ViZTI5YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJfdG9tYXRvel8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODM0ZWJjYzdkMWExODcxNTZhZGNlMjdjYmY1ZDRlMWYzNjhjMThiMzZhYTRjY2VlNmMyMGIzYzJlY2YzOGU1NiIKICAgIH0KICB9Cn0=";
    }

}
