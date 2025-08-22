package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SUPREME_CHOCOLATE_BAR extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Supreme Chocolate Bar";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SUPREME_CHOCOLATE_BAR"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 3;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxMTk3OTUyOTAwNywKICAicHJvZmlsZUlkIiA6ICJlZjVjZjkzYWFhMTY0ZTMyODQ4NDYxYjIzNGQ1YWJhNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJfXzciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjU0YjdmM2YyYTZmMGQxYzJjMDU0Njc4MTI4ZWMyMzIyNjE5YWVmZmYwZjQ1MGMzOTBkNmE0MWI1OTUwMzAyZSIKICAgIH0KICB9Cn0=";
    }

}
