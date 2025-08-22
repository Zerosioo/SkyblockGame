package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ULTIMATE_CARROT_CANDY_UPGRADE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Ultimate Carrot Candy Upgrade";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ULTIMATE_CARROT_CANDY_UPGRADE"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4OTUxMjU4MDA0MiwKICAicHJvZmlsZUlkIiA6ICJlZDUzZGQ4MTRmOWQ0YTNjYjRlYjY1MWRjYmE3N2U2NiIsCiAgInByb2ZpbGVOYW1lIiA6ICI0MTQxNDE0MWgiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjFlNmYwNjg0YmE3ZDUxZmI3YjBhNzk0ZTRkZmEzZGE3Y2UyMzYxYmQwNGE3NmIzNzYyOWYwMWIyNWI5NmQwMCIKICAgIH0KICB9Cn0=";
    }

}
