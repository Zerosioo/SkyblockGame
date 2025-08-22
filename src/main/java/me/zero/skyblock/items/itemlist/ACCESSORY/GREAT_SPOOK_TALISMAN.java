package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GREAT_SPOOK_TALISMAN extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Great Spook Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GREAT_SPOOK_TALISMAN"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2Mzk1OTYwNDI2MywKICAicHJvZmlsZUlkIiA6ICIyNDIyZWM1ZWFiZDM0MDQ5YmYzNjBlOTFiMTFhMmFmZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJsYXJnZWJyZWFzdHMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjgzYWRmNjQ4ZDRlOTdkZTNiOTI4YTRlODJkMTE2OWMxOTc4ZDcxZTE4NzU3Y2JhZWUzNjYyN2I5YjBkM2YyZSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
