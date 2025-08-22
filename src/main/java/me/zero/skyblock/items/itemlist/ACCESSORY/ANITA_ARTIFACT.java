package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ANITA_ARTIFACT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Anita's Artifact";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ANITA_ARTIFACT"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5NzU4NDE3NjIwOCwKICAicHJvZmlsZUlkIiA6ICI2NTk0YzdiMTExOWE0Njc3ODc0Y2ZmOWNlMzM3NzYxOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYXJzaG1lbGxvMjIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGZlYWJkYWRkNWY1OTM3NzFmYTIzYzk0ZmM2ODE2MDkxOTE3MzcxZmQ1YTFjNzQ3MjNlNzE2MjEwZDZlNmVmYiIKICAgIH0KICB9Cn0=";
    }

}
