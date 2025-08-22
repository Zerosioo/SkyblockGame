package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIAMOND_PROFESSOR_HEAD extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Diamond Professor Head";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIAMOND_PROFESSOR_HEAD"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.PROFESSIONAL;
    }

    @Override
    public int getStrength() {
        return 20;
    }

    @Override
    public int getHealth() {
        return 100;
    }

    @Override
    public int getDefense() {
        return 40;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4ODcyMjM0NDUzNiwKICAicHJvZmlsZUlkIiA6ICI2NjI3NjU4MzhkMWQ0YmU0YjU1NmRkOTQwMmE1MDU0NiIsCiAgInByb2ZpbGVOYW1lIiA6ICJfTWF0dEd6ejI4OV8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjIzYzNhZDhjNDQxMDE0NTA5NTI4MDc3OTI5M2NjMWU3OTA0YjZmY2U5M2Q3MDM3OGFjNWYzMjAzMmJhMWQ4NiIKICAgIH0KICB9Cn0=";
    }

}
