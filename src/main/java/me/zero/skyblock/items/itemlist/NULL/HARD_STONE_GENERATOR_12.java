package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HARD_STONE_GENERATOR_12 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Hard Stone Minion XII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HARD_STONE_GENERATOR_12"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxOTExMjYxNjY2OCwKICAicHJvZmlsZUlkIiA6ICJiYTliMmJhZmY4MjQ0NjcwYWZkNmQwNDM3ZjczZWFkYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJfRGFzQXVnZV8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzJlZDNmMmJmMjBiODU4MjhiNzc0MjQ2MGY4Yzc4ZmQyMDAxY2EwMzgwYzQ1NWI4NmRhZGViODBmMjhiY2NiZCIKICAgIH0KICB9Cn0=";
    }

}
