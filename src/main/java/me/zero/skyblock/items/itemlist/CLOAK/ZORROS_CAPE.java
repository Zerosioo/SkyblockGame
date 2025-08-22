package me.zero.skyblock.items.itemlist.CLOAK;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZORROS_CAPE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Zorro's Cape";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oNot all Rabbits","§8§owear capes.")); 
    }

    @Override
    public String getId() {
        return "ZORROS_CAPE"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.PROFESSIONAL;
    }

    @Override
    public int getFerocity() {
        return 2;
    }

    @Override
    public int getFarmingWisdom() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxMjAyNDY1Mzc0MSwKICAicHJvZmlsZUlkIiA6ICI0MDNlYmEzYjhkODg0MDVlYjhjMDlkNTQ4NmFjYzdiZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJWb3J0ZXh0dHYiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODFmNzIyNmE5Mjc1NThkMDY5YTZhZTM0M2I0ZTA4OWZiZDYwZmM2MDM3MTkwMDk3Yzc3MTMyMDhlOTg4ZmFhZSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
