package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TERROR_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Terror Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TERROR_HELMET"; 
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
    public int getCritDamage() {
        return 50;
    }

    @Override
    public int getHealth() {
        return 160;
    }

    @Override
    public int getDefense() {
        return 50;
    }

    @Override
    public int getIntelligence() {
        return 15;
    }

    @Override
    public int getSpeed() {
        return 12;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDE2MDk4NSwKICAicHJvZmlsZUlkIiA6ICI4ZGU4ZWU3MTMyMTY0NGNhYTllZjJlNTVjODRjNGU4ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJIdW5kZXNjaG9uVE0iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTJhZjg4MzM2OTdjODFiNDZlODNjOGYxODk1MjY2ZTYwNmVmYmIzYTU5ZjFjM2I0Y2EyODE2ZGEyYmNmYTlkNiIKICAgIH0KICB9Cn0=";
    }

}
