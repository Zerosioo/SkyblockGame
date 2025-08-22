package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TARANTULA_BLACK_WIDOW extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Black Widow Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TARANTULA_BLACK_WIDOW"; 
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
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMzUxMzA1MjAwNCwKICAicHJvZmlsZUlkIiA6ICIwNjNhMTc2Y2RkMTU0ODRiYjU1MjRhNjQyMGM1YjdhNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJkYXZpcGF0dXJ5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2IyYjY3MzJlYWE5Nzg4NDU4NDY4ZjU5NzY5NDM5ODY0NjQ5NzRhZjM1ZmVhZmI0ZmNhZDA1YTdhMzA4YzJhNjciLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
