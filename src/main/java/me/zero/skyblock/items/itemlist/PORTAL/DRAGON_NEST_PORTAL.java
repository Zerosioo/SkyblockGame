package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DRAGON_NEST_PORTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portal to the Dragon's Nest";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DRAGON_NEST_PORTAL"; 
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
        return ItemType.PORTAL;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMDY2NDExNDg5NiwKICAicHJvZmlsZUlkIiA6ICI2MWVhMDkyM2FhNDQ0OTEwYmNlZjViZmQ2ZDNjMGQ1NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVEYXJ0aEZhdGhlciIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lY2YxYjM1NDBmZDJmNjAzY2NmNDI2NzdjOGU4Y2FlN2NmZmIwZTFhZTIzYzYxYzUyMjI5OGVjNDRkMzEyZGNjIgogICAgfQogIH0KfQ==";
    }

}
