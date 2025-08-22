package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPINE_FOSSIL extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Spine Fossil";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("A well-preserved set","of neural spines.","Whatever possessed","these was an adept","swimmer.")); 
    }

    @Override
    public String getId() {
        return "SPINE_FOSSIL"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 50000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODY0MzQyOTQxNiwKICAicHJvZmlsZUlkIiA6ICJiZWNlZGU1YmRkODY0YTkwOTc3MTRmODk0ZWUxNmE3MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTYW1hQ29tcG9zZXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTA4YWMxODAwMGQ3YTNkMWI3NmNlODkyNmE0OGMyMmYyNTI4OWZmMDRhYjc5YmY3Y2ZhMTQyZjNmMDcxM2NhYiIKICAgIH0KICB9Cn0=";
    }

}
