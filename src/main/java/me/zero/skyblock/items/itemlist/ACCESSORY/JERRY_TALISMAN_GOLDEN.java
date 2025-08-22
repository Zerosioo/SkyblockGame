package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JERRY_TALISMAN_GOLDEN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Golden Jerry Artifact";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JERRY_TALISMAN_GOLDEN"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public int getIntelligence() {
        return -4;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDU4NTg0NjQ0MSwKICAicHJvZmlsZUlkIiA6ICI2OTBkMDM2OGM2NTE0OGM5ODZjMzEwN2FjMmRjNjFlYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ5emZyXzciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzk2NGY2MDZmZWNjMzI0NTFmYmRlZDFiNmY1ZDRmMjJkYjhmMDE4ZjdkOGRiNzhiMTIyY2E3NWY5ZDFjMDU3NCIKICAgIH0KICB9Cn0=";
    }

}
