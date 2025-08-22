package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FROZEN_BLAZE_HELMET extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Frozen Blaze Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FROZEN_BLAZE_HELMET"; 
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
        return Gamestage.EXPERT;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getPrice() {
        return 576000;
    }

    @Override
    public int getStrength() {
        return 40;
    }

    @Override
    public int getDefense() {
        return 105;
    }

    @Override
    public int getSpeed() {
        return 2;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MTA4NTAzNTkyNywKICAicHJvZmlsZUlkIiA6ICJjMTNkYzkxZjg1YjA0ZWM4OGU2NDk5YzdjZDc4Zjk3MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJjYXNzdGhlY3J5cHRpZCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83MDMxMGI1NWVlZDk1OGZlZThmZmFhZjcxODQ2NzE2N2RlYjFhN2M5MDQ2ZDY3YjI1ODg3YjU5NjkyNTYzNmJiIgogICAgfQogIH0KfQ==";
    }

}
