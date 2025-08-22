package me.zero.skyblock.items.itemlist.CARNIVAL_MASK;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZOMBIE_MASK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Zombie Mask";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ZOMBIE_MASK"; 
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
        return ItemType.CARNIVAL_MASK;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNDI0NjMyNTQ5NiwKICAicHJvZmlsZUlkIiA6ICJmYjNhZTU0OTU3ODQ0MGVlODIzODJlMDY2MzlhYTkzMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJXZWx0ZXJ3ZWlnaHQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWJmYjY1NjUwODJkOWYyZjdhYjhhNThlYzhiNDU0OTA5MTEwMmE3Mjk0NGI5NTZjN2FhZmU0ZDJkNDljZDZkNyIKICAgIH0KICB9Cn0=";
    }

}
