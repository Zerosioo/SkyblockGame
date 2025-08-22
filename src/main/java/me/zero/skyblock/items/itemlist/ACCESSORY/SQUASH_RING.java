package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SQUASH_RING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Squash Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SQUASH_RING"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3ODgyMjI2OTQ0MCwKICAicHJvZmlsZUlkIiA6ICJjYTU4NzNhYmY0Y2U0YWUxODAxZmVmODgzNjhlMWExNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJEZXRocm9uZXMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjg4MWEzODgwMGExYzg2N2QyYTFhOGExMGM4NTQzYWU4YTNiOGE5YTg3YzFhYzU4YmExZTI4M2JiMGRjM2Q2OCIKICAgIH0KICB9Cn0=";
    }

}
