package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TITANIUM_TESSERACT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Titanium Tesseract";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TITANIUM_TESSERACT"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxODI5NjcyMzc0NiwKICAicHJvZmlsZUlkIiA6ICJmZDIwMGYwMDE4OTI0NzgxODI5OWIzZjE5Yzc4Y2E3MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ0dXNnIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2E4OGY4YjU1MTBiNzNhNTA0NWY1OTIxN2UxY2FjNDg5NDZhNzA0MGM0MTkyNDJkYjljMDRlNGM1ZDBiZjdhM2EiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
