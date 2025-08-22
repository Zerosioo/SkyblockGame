package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLD_THORN_HEAD extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Golden Thorn Head";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOLD_THORN_HEAD"; 
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
        return Gamestage.SKILLED;
    }

    @Override
    public int getStrength() {
        return 15;
    }

    @Override
    public int getHealth() {
        return 50;
    }

    @Override
    public int getDefense() {
        return 25;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzU1Mzc0OSwKICAicHJvZmlsZUlkIiA6ICJjYzU2NjAzYmZiZjg0OGJmOTM3MzY1N2VjYzUyNGI4NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJpc2FhYWFhYV8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTQwMTY4ZTdmN2JjY2QxOWI1YTFlZGU5YTE5NmI0MWM1N2M5MTk4NWVjNzIzYmNmNDIyMDk2NzUyNTU4MjE1OCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
