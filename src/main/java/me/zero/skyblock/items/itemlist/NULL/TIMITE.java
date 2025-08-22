package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TIMITE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Timite";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7Older, wiser, but","§7refusing to admit","§7it's just a phase.")); 
    }

    @Override
    public String getId() {
        return "TIMITE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyNTMyNTgwNDE0MywKICAicHJvZmlsZUlkIiA6ICIxMTM1Njg1ZTk3ZGE0ZjYyYTliNDQ3MzA0NGFiZjQ0MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYXJpb1dsZXMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDIxNzdhYzk5N2ZmOTcwOTAwY2QxNzkyN2ZiMzFjNGUyMGZhYzI2MzY0OWIxYjU1ODU1NWJjYzZmMGQ1YjVkZCIKICAgIH0KICB9Cn0=";
    }

}
