package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RIFT_PRISM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Rift Prism";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RIFT_PRISM"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MDAxOTAwNzcyOCwKICAicHJvZmlsZUlkIiA6ICJmODFhNzJhZWZjMjY0MjU0YTQ5NzE0OWYzMjJiZjJlNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEZXJsYW5fODgiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2NhYTViZjFiZWRlOWEyN2EwZDBiOTg1Zjc3ZThiOTczMGQ1ZGIzZWRhOTUyZGZlM2YxYTMxYjg3ZDVlZmVjOCIKICAgIH0KICB9Cn0=";
    }

}
