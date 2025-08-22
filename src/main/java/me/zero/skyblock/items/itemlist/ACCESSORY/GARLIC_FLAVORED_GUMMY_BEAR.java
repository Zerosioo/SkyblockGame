package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GARLIC_FLAVORED_GUMMY_BEAR extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Perma-Jelled Garlic-Flavored Re-Heated Gummy Polar Bear";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GARLIC_FLAVORED_GUMMY_BEAR"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4MTQ1ODg2Njk2MywKICAicHJvZmlsZUlkIiA6ICJmZTE0M2FhZTVmNGE0YTdiYjM4MzcxM2U1Mjg0YmIxYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJKZWZveHk0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2NiMGQxNjI4ZTQyYmRmYTU0ZDAyZWE2NjRmMmNhOWUzMmE3MWMwZTg0YWEyMWRiMWQzMjkyNGQzZjVlM2QzNTIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
