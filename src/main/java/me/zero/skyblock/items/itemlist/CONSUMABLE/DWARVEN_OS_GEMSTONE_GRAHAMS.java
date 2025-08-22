package me.zero.skyblock.items.itemlist.CONSUMABLE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DWARVEN_OS_GEMSTONE_GRAHAMS extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Dwarven O's Gemstone Grahams";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DWARVEN_OS_GEMSTONE_GRAHAMS"; 
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
        return ItemType.CONSUMABLE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNjQ5MTA5ODE0NywKICAicHJvZmlsZUlkIiA6ICJlOTUyODY0OGZhYzU0ZDdlOGI0ZGU1NDhiMzU3MDY5OCIsCiAgInByb2ZpbGVOYW1lIiA6ICIwNjAwMDEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTY2YzUwZjFhYTkxNzIzOWIxNzlkY2MwM2RmYjFlZDZiNWQyODQ0ZWI4YzhmYTc3OWYxMjIzZDZjYmJhNTA2MyIKICAgIH0KICB9Cn0=";
    }

}
