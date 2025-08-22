package me.zero.skyblock.items.itemlist.CLOAK;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENDER_CLOAK extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Ender Cloak";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENDER_CLOAK"; 
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
        return ItemType.CLOAK;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public int getPrice() {
        return 10000;
    }

    @Override
    public int getHealth() {
        return 15;
    }

    @Override
    public int getDefense() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1NjUzNzc2NzM4NywKICAicHJvZmlsZUlkIiA6ICIzYWJkYjI5ZDI2MTU0YTAxOWEzZWQ3OGRlMzI4OWUxNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJFcmljSHViZXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzc3OGZiNmYyZTY0OWMwYWRhYmY1MWVmNDVjN2NlMzIzZmUxNzU4ZjZkYWM0ZjhjZDEzYWRkMWUyYWYyOWZmNiIKICAgIH0KICB9Cn0=";
    }

}
