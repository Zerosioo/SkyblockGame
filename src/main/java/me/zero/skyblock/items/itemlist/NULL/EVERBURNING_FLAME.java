package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EVERBURNING_FLAME extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Everburning Flame";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EVERBURNING_FLAME"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public int getPrice() {
        return 159855;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MzYxMTQ1MjY1MywKICAicHJvZmlsZUlkIiA6ICJlMmVkYTM1YjMzZGU0M2UxOTVhZmRkNDgxNzQ4ZDlhOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJDaGFsa19SaWNlR0kiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTkwY2JkNzJlNDFhOWJkNDExYmU5MjliNzNmZDI2OTIwNjM2OGIyODEwZDZjNjgxOTkxOGNiOGViNjYyMjRmNCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
