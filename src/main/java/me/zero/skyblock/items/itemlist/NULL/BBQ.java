package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BBQ extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "BBQ Grill";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BBQ"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU4OTQwNTY2OTM0NCwKICAicHJvZmlsZUlkIiA6ICJiNzQ3OWJhZTI5YzQ0YjIzYmE1NjI4MzM3OGYwZTNjNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTeWxlZXgiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTFlYWVhMjVmM2RmOGU1ZjAyODdkZWY3MmQ0NDZiY2RmYTk3YmUyOWNiOWU2MTVmNzc2MDFmMTU5MWQ0YzY1MiIKICAgIH0KICB9Cn0=";
    }

}
