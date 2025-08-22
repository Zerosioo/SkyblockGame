package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HOT_TERROR_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Hot Terror Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HOT_TERROR_HELMET"; 
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
    public int getCritDamage() {
        return 63;
    }

    @Override
    public int getHealth() {
        return 202;
    }

    @Override
    public int getDefense() {
        return 63;
    }

    @Override
    public int getIntelligence() {
        return 19;
    }

    @Override
    public int getSpeed() {
        return 15;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDEyNzczOCwKICAicHJvZmlsZUlkIiA6ICJmYzUwMjkzYTVkMGI0NzViYWYwNDJhNzIwMWJhMzBkMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2JkZWEzMGUzMDU0ODM3MTNhYzlhNTI5NWFlNjk4ZDQxMDk3NjZjOWFlMmJjNzQ0YWM1OGY2YmI0Y2Y5M2E5ZjEiCiAgICB9CiAgfQp9";
    }

}
