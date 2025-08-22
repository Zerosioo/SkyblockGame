package me.zero.skyblock.items.itemlist.BELT;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DOJO_BLUE_BELT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Blue Belt";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DOJO_BLUE_BELT"; 
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
        return ItemType.BELT;
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
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getHealth() {
        return 25;
    }

    @Override
    public int getDefense() {
        return 15;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MzU5OTY3OTc4MywKICAicHJvZmlsZUlkIiA6ICJiNzVjZDRmMThkZjg0MmNlYjJhY2MxNTU5MTNiMjA0YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJLcmlzdGlqb25hczEzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzVhNGY3ZTU3YTQzNTk0NTdjZTBlN2RhMjdlODUxM2E4YjYxOTdmMWNhNjhkMDcxNTQyYzY2ZjhhNDFiYWY0ZWQiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
