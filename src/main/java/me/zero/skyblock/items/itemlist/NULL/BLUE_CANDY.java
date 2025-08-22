package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLUE_CANDY extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Blue Candy";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BLUE_CANDY"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzkzNDA3NiwKICAicHJvZmlsZUlkIiA6ICJhNDAxZjEzMTZlMjI0ZTNjOTg0ODk1MmVjMzhjMTEwYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJHcmVlbnNoZWVwaXJhdGUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWU4OTQwZWQ4YWQ1NmYzMmY5YmJkMzY3MmY5MzY3MGNmMmNmYzVlZjA0NDE2ZTFkNDY4MDI4N2UzMTlmNzljMiIKICAgIH0KICB9Cn0=";
    }

}
