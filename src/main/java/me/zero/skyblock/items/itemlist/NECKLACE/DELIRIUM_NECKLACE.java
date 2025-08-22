package me.zero.skyblock.items.itemlist.NECKLACE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DELIRIUM_NECKLACE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Delirium Necklace";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DELIRIUM_NECKLACE"; 
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
        return ItemType.NECKLACE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getPrice() {
        return 52000;
    }

    @Override
    public int getStrength() {
        return 1;
    }

    @Override
    public int getCritDamage() {
        return 1;
    }

    @Override
    public int getHealth() {
        return 1;
    }

    @Override
    public int getDefense() {
        return 1;
    }

    @Override
    public int getIntelligence() {
        return 1;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public int getMagicFind() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MzU5OTM1NjU3OCwKICAicHJvZmlsZUlkIiA6ICI0NmY3N2NjNmQ2MjU0NjEzYjc2NmYyZDRmMDM2MzZhNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaXNzV29sZiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kNGNiZTg5M2UwZjgyMzAxYzVjZGNlMWI4MTgxODAzYjRmYjgzY2JmMzAzMDRkYjEzOWEzM2Q1NjlkNGVkOGMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
