package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WISE_WITHER_HELMET extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Storm's Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WISE_WITHER_HELMET"; 
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
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.PROFESSIONAL;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getGearScore() {
        return 25;
    }

    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public int getHealth() {
        return 180;
    }

    @Override
    public int getDefense() {
        return 80;
    }

    @Override
    public int getIntelligence() {
        return 400;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNTYyMzM2NjgxNiwKICAicHJvZmlsZUlkIiA6ICI5MWYwNGZlOTBmMzY0M2I1OGYyMGUzMzc1Zjg2ZDM5ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTdG9ybVN0b3JteSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mODMxNTljNWJiN2Q4MDQ1NGQyZDY0NmIxNTc3NGI3MTE2YWFiY2IzYWY1YjY3NzdhMjc1NzNmYzQ1Zjc4NTRmIgogICAgfQogIH0KfQ==";
    }

}
