package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HOT_HOLLOW_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Hot Hollow Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HOT_HOLLOW_HELMET"; 
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
        return 219;
    }

    @Override
    public int getDefense() {
        return 69;
    }

    @Override
    public int getIntelligence() {
        return 164;
    }

    @Override
    public int getSpeed() {
        return 6;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDIyMjk5MSwKICAicHJvZmlsZUlkIiA6ICIwZWQ2MDFlMDhjZTM0YjRkYWUxZmI4MDljZmEwNTM5NiIsCiAgInByb2ZpbGVOYW1lIiA6ICJOZWVkTW9yZUFjY291bnRzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2NjMzQ0ZDY1YWU2YmMyMjMwZWUyMjBkNzZkZGExZTA4MGY5MDI4MmNhMGY5ZjBkOWJjOTY2N2QyMjA0OGNlOWYiCiAgICB9CiAgfQp9";
    }

}
