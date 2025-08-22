package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WARDEN_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Warden Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WARDEN_HELMET"; 
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
        return Gamestage.PROFESSIONAL;
    }

    @Override
    public int getHealth() {
        return 300;
    }

    @Override
    public int getDefense() {
        return 100;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1ODc4NTE2MTE5NDksInByb2ZpbGVJZCI6ImIwZDczMmZlMDBmNzQwN2U5ZTdmNzQ2MzAxY2Q5OGNhIiwicHJvZmlsZU5hbWUiOiJPUHBscyIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTVlYjBiZDg1YWFkZGYwZDI5ZWQwODJlYWMwM2ZjYWRlNDNkMGVlODAzYjBlODE2MmFkZDI4YTYzNzlmYjU0ZSIsIm1ldGFkYXRhIjp7Im1vZGVsIjoic2xpbSJ9fX19";
    }

}
