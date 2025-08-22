package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SKYBLOCK_TABLE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Dark Oak Table";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SKYBLOCK_TABLE"; 
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
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NTk5MDU1MywKICAicHJvZmlsZUlkIiA6ICJiNjc3NTgwYzExYmU0ZjNiODI1OGM0YjBkNzNhNzg0ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJPZmZpY2lhbGx5SksiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTY3NGRiNDQ2ZmU4MWQwOTNhMTU2YzNiZGNlYmE2OTJkNGYxYjQxZDk1NTE5MTcyZGRjN2FmMjI0NDI2MDFiZSIKICAgIH0KICB9Cn0=";
    }

}
