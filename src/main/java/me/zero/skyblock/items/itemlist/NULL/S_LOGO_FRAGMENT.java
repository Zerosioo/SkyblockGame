package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S_LOGO_FRAGMENT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "W Logo Fragment";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oEven wizards can","§7§ohave branding","§7§ofailures.")); 
    }

    @Override
    public String getId() {
        return "S_LOGO_FRAGMENT"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyNTk5MzExMzk0NiwKICAicHJvZmlsZUlkIiA6ICIxMTM1Njg1ZTk3ZGE0ZjYyYTliNDQ3MzA0NGFiZjQ0MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYXJpb1dsZXMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzNmZmVmN2Q0NDEzNDczZjUzMTk5OTNiZjkxOTM0ODkyNGE5NDRkYmViMWE4ZWYxOTRmOWFjOGRmNzhjNDA1ZiIKICAgIH0KICB9Cn0=";
    }

}
