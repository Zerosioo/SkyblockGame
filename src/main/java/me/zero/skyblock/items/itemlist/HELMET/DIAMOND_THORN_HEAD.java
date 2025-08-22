package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIAMOND_THORN_HEAD extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Diamond Thorn Head";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIAMOND_THORN_HEAD"; 
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
        return 25;
    }

    @Override
    public int getHealth() {
        return 130;
    }

    @Override
    public int getDefense() {
        return 50;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzM1NjQ3OSwKICAicHJvZmlsZUlkIiA6ICI4NDIyMDRlNjY4ODA0ODdiYWU1YTA1OTUzOTRmOTk0OCIsCiAgInByb2ZpbGVOYW1lIiA6ICJuZWE4OW8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzgzYTFmZmFkY2M2Y2NjNTQ5MDVmMmE3OWI5NjNhMzM5YmI5ZTBiMGJjZWE0MjgyNTJhMTdmMDFlMzE3YmVjMCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
