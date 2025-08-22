package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLORAL_WHEELBARROW extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Floral Wheelbarrow";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLORAL_WHEELBARROW"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1OTI4MjQxMjM5MSwKICAicHJvZmlsZUlkIiA6ICIyNDIyZWM1ZWFiZDM0MDQ5YmYzNjBlOTFiMTFhMmFmZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJsYXJnZWJyZWFzdHMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzA5ZWMwZDY0NWQwZDVhYTI3MTAwYTg4NmFiNzY0ZjI1ZjdmOWQwYTYwMzQ5ODEzYzQ2N2NmZTBkZGZiZDhlYyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
