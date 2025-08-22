package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PEST_TRAP extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Pest Trap";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PEST_TRAP"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyNzczMTYxNDM0MywKICAicHJvZmlsZUlkIiA6ICI1N2I3OWE2NTllZTM0ODhmODBhM2ExOGQwNDYxMTg3YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaW1hdGlrX1giLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzYyMWZhNDkwZjJiY2MzODY5ZmIzNGM4MzQ2NGE3ZGI1NmNmMzNiZDk5ZDY1OTZmM2I1MjAxNzQ5NjQzYjdmZSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
