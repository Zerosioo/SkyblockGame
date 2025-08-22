package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIERY_FERVOR_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Fiery Fervor Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FIERY_FERVOR_HELMET"; 
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
    public int getHealth() {
        return 360;
    }

    @Override
    public int getDefense() {
        return 200;
    }

    @Override
    public int getTrueDefense() {
        return 10;
    }

    @Override
    public int getIntelligence() {
        return 30;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDI3NDQ3MCwKICAicHJvZmlsZUlkIiA6ICIxYTc1ZTNiYmI1NTk0MTc2OTVjMmY4NTY1YzNlMDAzZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUZXJvZmFyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzczZjY1ZmZmZThmYjRlNzBlZTFjMWVkYjhkOGY1ZWY3YmI2NmQwZmQxODA3ZmIyNTY4YjA5ZjFhYjk3NmQ2NGYiCiAgICB9CiAgfQp9";
    }

}
