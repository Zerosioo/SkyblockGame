package me.zero.skyblock.items.itemlist.NECKLACE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RIFT_NECKLACE_OUTSIDE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "%%light_purple%%Rift Necklace";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RIFT_NECKLACE_OUTSIDE"; 
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
        return ItemType.NECKLACE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getCombatWisdom() {
        return 1;
    }

    @Override
    public int getFarmingWisdom() {
        return 1;
    }

    @Override
    public int getEnchantingWisdom() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0Nzg2ODQ3MDQxOCwKICAicHJvZmlsZUlkIiA6ICIwNjNhMTc2Y2RkMTU0ODRiYjU1MjRhNjQyMGM1YjdhNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJkYXZpcGF0dXJ5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzljMDg5NDkzMWE1MTAzODdlNGY2MTM4MjhmMDIzOWNhNGQ5MDg1MzQ5OTYzN2Y2MDc5ZDM5MzI3ZjE0NmYwZTkiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
