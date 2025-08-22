package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NOT_DEADGEHOG_MASK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Not-Dead-Gehog Mask";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "NOT_DEADGEHOG_MASK"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4MTE0NTkxNDMxNSwKICAicHJvZmlsZUlkIiA6ICJiYzRlZGZiNWYzNmM0OGE3YWM5ZjFhMzlkYzIzZjRmOCIsCiAgInByb2ZpbGVOYW1lIiA6ICI4YWNhNjgwYjIyNDYxMzQwIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzc5YThhMGIyZmMzNDU3NmIxM2M3YWYwMjA3OTA3NGY3NWUyNmJiNDkyNDRlZWE1ZTg4NDFmMGIxM2ZhN2YwNjIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
