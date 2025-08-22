package me.zero.skyblock.items.itemlist.CLOAK;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BACKWATER_CLOAK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Backwater Cloak";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BACKWATER_CLOAK"; 
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
        return ItemType.CLOAK;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getFishingSpeed() {
        return 2;
    }

    @Override
    public int getSeaCreatureChance() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTc0MDQxOTAyNTg2OCwKICAicHJvZmlsZUlkIiA6ICJiNzAwZDM2YjRkYmE0NDQzOTUzNjc4NDVlNWViZTA5MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJleGVjdXRvcnkiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjJhZGVlY2JmMjBiNThmZDRjYWQ4YWFhM2I0NjUzZDcxNjVlMDdhYTE2N2JlNDhhMzIxYjA5NmQ1NmE5ZmUzNSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
