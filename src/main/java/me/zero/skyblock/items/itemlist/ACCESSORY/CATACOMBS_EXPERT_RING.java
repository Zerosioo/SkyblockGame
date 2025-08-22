package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CATACOMBS_EXPERT_RING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Catacombs Expert Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CATACOMBS_EXPERT_RING"; 
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
        return Rarity.EPIC;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxOTk5NTQ4MTM1NywKICAicHJvZmlsZUlkIiA6ICI0NWY3YTJlNjE3ODE0YjJjODAwODM5MmRmN2IzNWY0ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJfSnVzdERvSXQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGZjYzIxM2QzMzY5YjU1NzBlZGQzNTQ5ZDIyMjc3ZmM0OTZiZmNlNTM5ZDE5Zjc1ODNkNmQ2NGJiMTY0OWNiMyIKICAgIH0KICB9Cn0=";
    }

}
