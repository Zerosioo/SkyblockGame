package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MOUSE_PEST_TRAP extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Mouse Trap";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MOUSE_PEST_TRAP"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTczMDUzNzU0NzE5MiwKICAicHJvZmlsZUlkIiA6ICJiYTBhMzYwZDM5ZDQ0N2JmOTNiZjBhMTU2ZDUzZTZjNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJMZW9sb3oxMDAiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTRlN2UyNmRjNThmYzAzNDk2NTc1NTUxMGY4MDBiNTNkMjY5NzFlMjc0YTJlM2UxYmM5ZDI5NWViYWJkNjUxNyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
