package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BINGO_RELIC extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Bingo Relic";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BINGO_RELIC"; 
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
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDAzOTEyOTQzNywKICAicHJvZmlsZUlkIiA6ICI5NWU5ODU1MzMwMmE0ZjdhYjRmNGQwYjZkZmE0MTkwMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJIX19JX19NIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2M1MTVhY2Y0YTZhYzY5ODczNmU1NGRlZjBiYzc4MTQzYzE0NDQ5OTc4ZTc1MGFmYmI4ZDdhZGUwYWRmMGVmMDAiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
