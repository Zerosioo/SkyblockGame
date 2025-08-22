package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SALMON_HAT extends SItem implements ItemStatistics, SkullItem, Sellable, Museum {

    @Override
    public String getName() {
        return "Salmon Hat";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SALMON_HAT"; 
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
        return Rarity.COMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.STARTER;
    }

    @Override
    public int getPrice() {
        return 40;
    }

    @Override
    public int getStrength() {
        return 15;
    }

    @Override
    public int getSpeed() {
        return 2;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NzE0OTQwMDUwMTAsInByb2ZpbGVJZCI6ImVkNTNkZDgxNGY5ZDRhM2NiNGViNjUxZGNiYTc3ZTY2IiwicHJvZmlsZU5hbWUiOiJGb3J5eExPTCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTViNDM1MDNiMTBmNTJmNDhmNGJjYzQ3MTViNGEwYTU2ZTdlZjM5NTMzYTE4MWUyNWI0OGY1YzM4YWZmZTcxIn19fQ==";
    }

}
