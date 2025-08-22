package me.zero.skyblock.items.itemlist.GAUNTLET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GEMSTONE_GAUNTLET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Gemstone Gauntlet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GEMSTONE_GAUNTLET"; 
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
        return ItemType.GAUNTLET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getDamage() {
        return 300;
    }

    @Override
    public int getStrength() {
        return 50;
    }

    @Override
    public int getMiningSpeed() {
        return 800;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxODUyMTY2MzY1NCwKICAicHJvZmlsZUlkIiA6ICIxZDUyMzNkMzg4NjI0YmFmYjAwZTMxNTBhN2FhM2E4OSIsCiAgInByb2ZpbGVOYW1lIiA6ICIwMDAwMDAwMDAwMDAwMDBKIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzdiZjAxYzE5OGY2ZTE2OTY1ZTIzMDIzNWNkMjJhNWE5ZjRhNDBlNDA5NDEyMzQ0Nzg5NDhmZjlhNTZlNTE3NzUiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
