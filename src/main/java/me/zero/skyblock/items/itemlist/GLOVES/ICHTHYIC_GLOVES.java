package me.zero.skyblock.items.itemlist.GLOVES;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ICHTHYIC_GLOVES extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Ichthyic Gloves";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ICHTHYIC_GLOVES"; 
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
        return ItemType.GLOVES;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 4500;
    }

    @Override
    public int getFishingSpeed() {
        return 6;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MjU1OTQ5OTMwNywKICAicHJvZmlsZUlkIiA6ICJjMTNkYzkxZjg1YjA0ZWM4OGU2NDk5YzdjZDc4Zjk3MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJjYXNzdGhlY3J5cHRpZCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80YzM3N2Q3NzY3YTE3ZTk4ZDZjOTUwYjMyMWFmN2VmZDA5YmFmMWRiZTY4MjE1MzNhMDEyZTlhYzJlMWIyNjczIgogICAgfQogIH0KfQ==";
    }

}
