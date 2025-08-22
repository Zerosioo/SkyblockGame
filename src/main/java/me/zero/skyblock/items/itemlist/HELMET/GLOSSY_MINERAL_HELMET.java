package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GLOSSY_MINERAL_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Glossy Mineral Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GLOSSY_MINERAL_HELMET"; 
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
        return Gamestage.EXPERT;
    }

    @Override
    public int getDefense() {
        return 90;
    }

    @Override
    public int getSpeed() {
        return 20;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA1MjkxODg0NSwKICAicHJvZmlsZUlkIiA6ICJhN2E4YWY1NTk0ZGQ0OTJjYWViNjc1NzUzMzRlNmM0OCIsCiAgInByb2ZpbGVOYW1lIiA6ICJpdHNUcmFjZXJvdXRlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzY1MjhiMjM1YzYwNzQ2N2MzNjljYTljM2YyYmY4OTAxNGZlMmVhNDVmODhkZjI4ZDAyOWE1ODFmZjRiYjE3MjEiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
