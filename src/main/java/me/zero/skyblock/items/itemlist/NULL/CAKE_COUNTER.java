package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CAKE_COUNTER extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Cake Counter";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CAKE_COUNTER"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODM1MTMzMjczMSwKICAicHJvZmlsZUlkIiA6ICJmOGJmNDBjOWExYzY0ZTllOTIyZTc4M2UwMzNiODBiMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJUeGxvbjUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjExODU2NzY0MTY2NTNiZjcwNjAzYzcyM2ZmN2E0OGUwODBkYjY0OWE4Y2U1ZDY1YjQ2MWJmNjU0ODc0OTM1YSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
