package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WATER_HYDRA_HEAD extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Water Hydra Head";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WATER_HYDRA_HEAD"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public int getSeaCreatureChance() {
        return 2;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MDk1ODgxMzQ0NywKICAicHJvZmlsZUlkIiA6ICJjOTgyNzhiY2Y0YzI0ZWM4ODQxMDE1MzRhNWIyN2Y3NSIsCiAgInByb2ZpbGVOYW1lIiA6ICJnYWlhX2xpbmsiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmQ2YmNkM2JlYTBkZmYxZjQ1ZDgwOGU3YTg1NTBmOTUxMDZhZjQxYjZkOGQxOGEwNzkzZTE5YzkyNTVhZTg0NSIKICAgIH0KICB9Cn0=";
    }

}
