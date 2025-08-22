package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FALLEN_STAR_HAT extends SItem implements ItemStatistics, SkullItem, Sellable, Museum {

    @Override
    public String getName() {
        return "Fallen Star Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FALLEN_STAR_HAT"; 
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
        return Rarity.RARE;
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
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public int getHealth() {
        return 50;
    }

    @Override
    public int getDefense() {
        return 30;
    }

    @Override
    public int getIntelligence() {
        return 2;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NDA5MDg5NiwKICAicHJvZmlsZUlkIiA6ICIxOWY1YzkwMWEzMjQ0YzVmYTM4NThjZGVhNDk5ZWMwYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJzb2RpdW16aXAiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDk2ZjFmZThiMWNmZmIzZDVmZTJkYWFhMjU5YzE3MmVhZjU5MjY2OTBlYzM2NDc3OGQzZTQ3MWIyMDBiMjgzZSIKICAgIH0KICB9Cn0=";
    }

}
