package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PET_SKIN_ELEPHANT_GREEN extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "GreenElephant";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PET_SKIN_ELEPHANT_GREEN"; 
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
        return Rarity.RARE;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNTQwMTMxNDcxMCwKICAicHJvZmlsZUlkIiA6ICI5NGMzZGM3YTdiMmQ0NzQ1YmVlYjQzZDc2ZjRjNDVkYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJEb25fVml0b0Nvcmxlb25lIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzM2MGMxMjJhZGU1YjJmZWRjYTE0YWE3OGM4MzRhN2IwYWM5Y2I1ZGEyYTBjOTMxMTIxNjMwODZmOTBjMTNiNjgiCiAgICB9CiAgfQp9";
    }

}
