package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JERRY_TALISMAN_GREEN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Green Jerry Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JERRY_TALISMAN_GREEN"; 
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
    public int getIntelligence() {
        return -1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDU4NTE1MzgwNywKICAicHJvZmlsZUlkIiA6ICI0ZmFkNjk2NTIxNGI0NGQ4YjAxYzlhZTVjZDQ0MDVjOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJoaXBfYXNpYW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjU2NzI1MWQ3MWI2ZjNhNGRjMDNmYTAxZTQ0MWRlN2VkZjkzNTQ3OTRlNzRhZWMxNmMwNGYxNDFkZGYzMWM3MCIKICAgIH0KICB9Cn0=";
    }

}
