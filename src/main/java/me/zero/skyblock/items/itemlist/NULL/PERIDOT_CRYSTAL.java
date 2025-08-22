package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PERIDOT_CRYSTAL extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Peridot Crystal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PERIDOT_CRYSTAL"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxMDExNTkxNDg0MSwKICAicHJvZmlsZUlkIiA6ICI2NTk0YzdiMTExOWE0Njc3ODc0Y2ZmOWNlMzM3NzYxOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYXJzaG1lbGxvMjIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmQyOTk0NjgyOWZkYThmNDg3Y2FiNTgzNTk2OTkyZGQxNWViZWExYWM5MTI4OWZhYzZiYjI4NWVjOTBlYTE0NiIKICAgIH0KICB9Cn0=";
    }

}
