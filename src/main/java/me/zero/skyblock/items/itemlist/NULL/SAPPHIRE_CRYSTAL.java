package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SAPPHIRE_CRYSTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Saphhire Crystal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SAPPHIRE_CRYSTAL"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMDA3NjQwOTI1NSwKICAicHJvZmlsZUlkIiA6ICI0NWY3YTJlNjE3ODE0YjJjODAwODM5MmRmN2IzNWY0ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJfSnVzdERvSXQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTUwNjQ5NjI2YzQxMDEzNTJjNTk5NWM1M2I0OGJmZjYwYTkzODIxMmI3Y2U5MDI0MTVmZWI3NmVhMjczYjM1ZiIKICAgIH0KICB9Cn0=";
    }

}
