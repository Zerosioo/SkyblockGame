package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIVAN_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Helmet of Divan";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIVAN_HELMET"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.PROFESSIONAL;
    }

    @Override
    public int getHealth() {
        return 100;
    }

    @Override
    public int getDefense() {
        return 130;
    }

    @Override
    public int getMiningFortune() {
        return 30;
    }

    @Override
    public int getMiningSpeed() {
        return 80;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMDUzNDAyODc4NSwKICAicHJvZmlsZUlkIiA6ICIzYTNmNzhkZmExZjQ0OTllYjE5NjlmYzlkOTEwZGYwYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJOb19jcmVyYXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODNmNjllZjI3ZjMxMjBhNTEwNTBlNmJlNjZhMGUzZjhlODlhZjg4OGQ0ODA2NzE2YmY4NmY1OTBkYTYzODMxNyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
