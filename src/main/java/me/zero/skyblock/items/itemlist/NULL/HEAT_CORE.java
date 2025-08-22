package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HEAT_CORE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Heat Core";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HEAT_CORE"; 
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
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MDI0ODk1NSwKICAicHJvZmlsZUlkIiA6ICI3OGFjMTRjOWQzZGU0Y2Q5YThiMzNhYzZlOGE4YzQyMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJBbmdlbGFQbGF5c3oiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjhlYTI3Mzg0OWJiNGUzODNmMTFjODQ5NDUzOTUzYzEyMDViNmEwMGQ3NDBhYWMzMzA0MGQ1MDIwMjkzYjRiOCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
