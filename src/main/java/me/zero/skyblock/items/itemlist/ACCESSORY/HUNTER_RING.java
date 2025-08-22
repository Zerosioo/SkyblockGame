package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HUNTER_RING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Hunter Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HUNTER_RING"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getCombatWisdom() {
        return 5;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMjAzODk5NzYxNCwKICAicHJvZmlsZUlkIiA6ICJhNzFjNTQ5MmQwNTE0ZDg3OGFiOTEwZmRmZmRmYzgyZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJBcHBsZTU0NDciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWM1NzdlN2QzMWU1ZTA0YzJjZTcxZTEzZTM5NjIxOTJkODBiZDU0YjU1ZWZhYWNhYWVhMTI5NjZmZTI3YmY5IgogICAgfQogIH0KfQ==";
    }

}
