package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WISE_DRAGON_HELMET extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Wise Dragon Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WISE_DRAGON_HELMET"; 
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
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getPrice() {
        return 100000;
    }

    @Override
    public int getHealth() {
        return 70;
    }

    @Override
    public int getDefense() {
        return 110;
    }

    @Override
    public int getIntelligence() {
        return 125;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODQ4MDQzMDY1NywKICAicHJvZmlsZUlkIiA6ICJmZjQ3NzI5YmQwZDI0YWYwOThiMTFjMGE3ZTFiMGVlZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJtYXRzY2FuIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU3OTdjNzdjY2VlM2MwNGMzZGVlZDc3MDU5NWVhODNlYTFlODRjOWE0NjI5Yjc1M2FmNWQzNTFjMGNjMTFhNzQiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
