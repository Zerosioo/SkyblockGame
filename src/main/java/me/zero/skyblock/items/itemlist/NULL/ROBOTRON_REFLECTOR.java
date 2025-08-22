package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ROBOTRON_REFLECTOR extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Robotron Reflector";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ROBOTRON_REFLECTOR"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMTQ4MzkxNTA2MywKICAicHJvZmlsZUlkIiA6ICI1ZWE0ODg2NTg2OWI0Y2ZhOWRjNTg5YmFlZWQwNzM5MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJfUllOMF8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWNkODdjN2FmMDM5ZWY0YjJjN2EzN2U2Yjk0ZDllZWRhMjJkMmE1ZDJkZjQzODA0ZmZjYTllNDg2YTRlY2ExNSIKICAgIH0KICB9Cn0=";
    }

}
