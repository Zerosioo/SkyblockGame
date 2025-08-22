package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TITANIUM_ORE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Titanium";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oIts strength and","§7§oresistance to","§7§ocorrosion are","§7§othe highest of","§7§oany metallic","§7§oelement.")); 
    }

    @Override
    public String getId() {
        return "TITANIUM_ORE"; 
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
        return 20;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzYwODc1MiwKICAicHJvZmlsZUlkIiA6ICJiMGQ0YjI4YmMxZDc0ODg5YWYwZTg2NjFjZWU5NmFhYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaW5lU2tpbl9vcmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmVmNzUyMzU0MzVkMTQwMDQyYzhjNDk0OGUzZjRjOWE5M2RhYWIxNDAzNDM5MDgxMTI0YTljMzkxMTEzZDliYyIKICAgIH0KICB9Cn0=";
    }

}
