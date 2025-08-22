package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DRACONIC_RING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Draconic Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DRACONIC_RING"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2NTY2OTk2MjUwNywKICAicHJvZmlsZUlkIiA6ICI2ODAwNzFmZTIxOWE0OWNmYmM3MDIxMjc1NTI0NDIwMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZXphYm95ODAiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmVlMWU3NDA0NzI3N2E3MDY2MWE4ZWFmOWM0YzZlYmY4MzU1NGIyNzVhMTY4MTZlYzc5YmJhMWJjZTMyMDQzNCIKICAgIH0KICB9Cn0=";
    }

}
