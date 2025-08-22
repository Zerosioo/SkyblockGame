package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TITANIUM_FUEL_TANK extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Titanium-Infused Fuel Tank";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TITANIUM_FUEL_TANK"; 
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
    public int getPrice() {
        return 46000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDYzNjU2MzgwNywKICAicHJvZmlsZUlkIiA6ICJiMGQ0YjI4YmMxZDc0ODg5YWYwZTg2NjFjZWU5NmFhYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaW5lU2tpbl9vcmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWVmNWFjZjEzNGZhOTUyZjEzZmRmMGIzODk5MDYwY2MxOGViYzBhOTcxMzQ3ZTQ1YTMxZWNmOTVhNGIwYjMxYyIKICAgIH0KICB9Cn0=";
    }

}
