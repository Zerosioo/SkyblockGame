package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SCARLETON_PREMIUM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Scarleton Premium";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SCARLETON_PREMIUM"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzMDI4OTQ0MjkxMSwKICAicHJvZmlsZUlkIiA6ICI3ZmIyOGQ1N2FhZmQ0MmQ1YTcwNWNlZjE4YWI1MzEzZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJjaXJjdWl0MTAiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTg0NTI4MzFjMTAwYTE0NzU2MDgyYzU4ODE3OGU2MjcwNGM2ZWJiNzMwNTE3YzkxNWNlMjg1MDQxMThhNTBhZiIKICAgIH0KICB9Cn0=";
    }

}
