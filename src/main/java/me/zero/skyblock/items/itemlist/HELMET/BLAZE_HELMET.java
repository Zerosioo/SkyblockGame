package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLAZE_HELMET extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Blaze Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BLAZE_HELMET"; 
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
        return 576000;
    }

    @Override
    public int getStrength() {
        return 30;
    }

    @Override
    public int getDefense() {
        return 90;
    }

    @Override
    public int getSpeed() {
        return 2;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzE4ODMwMSwKICAicHJvZmlsZUlkIiA6ICIzZDU1OGQ3Y2NmZjk0ODdkYWE1MzhkMjM4NGE3OWFkZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDcnlwdGljTG9zZXIxMyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81MzFiMjE4MzM5MmViY2ZmZTIxN2E5ODNjOTZhNTczY2Y5MGRkNTg2ODdkMThmZDYzMDM2Y2NjNTllYjJmNDdkIgogICAgfQogIH0KfQ==";
    }

}
