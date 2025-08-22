package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REKINDLED_EMBER_HELMET extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Rekindled Ember Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REKINDLED_EMBER_HELMET"; 
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
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getPrice() {
        return 50000;
    }

    @Override
    public int getStrength() {
        return 30;
    }

    @Override
    public int getCritDamage() {
        return 20;
    }

    @Override
    public int getHealth() {
        return 175;
    }

    @Override
    public int getDefense() {
        return 50;
    }

    @Override
    public int getIntelligence() {
        return 15;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDUwMDg2NTQ4MiwKICAicHJvZmlsZUlkIiA6ICJhYTZhNzUwNWVkYmU0NjNiYjk1NWYyMWY0MjNiYTM1NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJub3RhbmR5d2FyaG9sIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzdiMjk5MTkxMWY0NTJhYzM0MWE4OTMzYjcxMGUxMzk5MDBiM2VmMGYwMzA3MTQxYTMwMjYwYzYyM2YwMjk3MTQiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
