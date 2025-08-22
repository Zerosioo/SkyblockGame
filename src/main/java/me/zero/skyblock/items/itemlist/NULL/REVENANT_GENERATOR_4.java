package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REVENANT_GENERATOR_4 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Revenant Minion IV";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REVENANT_GENERATOR_4"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTQ1MTkzNTgzNywKICAicHJvZmlsZUlkIiA6ICJlOTUyODY0OGZhYzU0ZDdlOGI0ZGU1NDhiMzU3MDY5OCIsCiAgInByb2ZpbGVOYW1lIiA6ICIwNjAwMDEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTEzODA3MWIxNTcwOWZkOThjODk1OTdhYmRkZWVmYjcwYmVlMzcwZmRjY2U3ZGE5Y2JmYTcyNzVmMjQyMTU1NyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
