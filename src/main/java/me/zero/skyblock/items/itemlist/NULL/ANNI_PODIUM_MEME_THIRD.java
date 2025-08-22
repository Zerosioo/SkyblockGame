package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ANNI_PODIUM_MEME_THIRD extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "10th Anniversary Podium";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ANNI_PODIUM_MEME_THIRD"; 
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
        return Rarity.EPIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4MTUwMTgzMTY2MSwKICAicHJvZmlsZUlkIiA6ICJkZDNjZGJiOTE2M2Q0NzgyOGQ0YmZkODZmYWE4NGY5ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJFTFdhbEtlUkpBSkEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmJkZDJmMTE1OWRmNWRlZjQ5YmVmMWJiYzIzMWMwMmM5YmYxYmJhYWMxMWUzY2U2NGUzM2Q4OGNjNmQ2YWE3ZiIKICAgIH0KICB9Cn0=";
    }

}
