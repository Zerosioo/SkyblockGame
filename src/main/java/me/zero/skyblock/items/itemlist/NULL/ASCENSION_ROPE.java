package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ASCENSION_ROPE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Ascension Rope";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ASCENSION_ROPE"; 
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
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3NjEzODI3OTE1MiwKICAicHJvZmlsZUlkIiA6ICI2MTJmZDAxMWY4YTQ0ZGIwOTU3ZTNjM2MyZTBkYmFlZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDYWxlbnRhZG94MTIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjk3NDBlYTg0YTNjN2UxZGI0YzliMmU2YjI3NzhiYTVmZWUwMDJlZWM1NzI0YTViNTFhMDU0MjgyOWE1NzQzYyIKICAgIH0KICB9Cn0=";
    }

}
