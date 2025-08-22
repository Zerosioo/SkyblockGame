package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INFERNAL_CRIMSON_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Infernal Crimson Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "INFERNAL_CRIMSON_HELMET"; 
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
    public int getStrength() {
        return 76;
    }

    @Override
    public int getCritDamage() {
        return 50;
    }

    @Override
    public int getHealth() {
        return 403;
    }

    @Override
    public int getDefense() {
        return 126;
    }

    @Override
    public int getIntelligence() {
        return 38;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDM1MTEzMSwKICAicHJvZmlsZUlkIiA6ICI4ODBiZWMwYTE0MmM0YzRlYTJlZjliMTFiMTBkNWNiNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJmZ2FiIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzUwN2Q2YmY3NjExMTkwZWQ5YzU4MGQ4Yzg3YzI5NjA1OTIxNjIzMGM5NTAxZWVjNjM1OWUwZDYwZWM4NDc1OGUiCiAgICB9CiAgfQp9";
    }

}
