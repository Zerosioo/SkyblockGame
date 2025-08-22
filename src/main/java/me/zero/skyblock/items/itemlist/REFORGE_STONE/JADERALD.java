package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JADERALD extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Jaderald";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JADERALD"; 
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
        return ItemType.REFORGE_STONE;
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDU0NjA1NDIxMywKICAicHJvZmlsZUlkIiA6ICI0ZmFkNjk2NTIxNGI0NGQ4YjAxYzlhZTVjZDQ0MDVjOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJoaXBfYXNpYW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjkxZjExMWRhNWI3NjM5ZmI0ZGMxN2RlYWIwMTY4ZGUyNGE4NzAwN2MzNzJiYTc5ZDYyY2I1ZTcxMGY3ZTJjMiIKICAgIH0KICB9Cn0=";
    }

}
