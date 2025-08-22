package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZOMBIE_HEART extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Zombie's Heart";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ZOMBIE_HEART"; 
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
        return Rarity.RARE;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 123000;
    }

    @Override
    public int getHealth() {
        return 50;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODc3MzM5OTY2MCwKICAicHJvZmlsZUlkIiA6ICJmZmU5MzczY2YyMDM0OWFhYTJlN2NiYzJkZmY2M2I5MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJNZWxvblR1bmExIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzY1ZDlkOThhZDZkMTU0ZWYxZjRjNjNkYmE5MmE1MTMzN2NkMWY0ZWIwY2I2NWI5YjJhOTBmZThiMDMwOTZkYjciLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
