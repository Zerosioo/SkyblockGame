package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BURNING_FERVOR_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Burning Fervor Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BURNING_FERVOR_HELMET"; 
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
        return 286;
    }

    @Override
    public int getDefense() {
        return 159;
    }

    @Override
    public int getTrueDefense() {
        return 8;
    }

    @Override
    public int getIntelligence() {
        return 24;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDI4OTE5MSwKICAicHJvZmlsZUlkIiA6ICJhYTZhNDA5NjU4YTk0MDIwYmU3OGQwN2JkMzVlNTg5MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJiejE0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzk3ZTJkMTc3ZmFhYzg2N2M5ZTQ5NTQyYWE0ZWM4MzFiNDU4ZDg1MzdmMjA2NzIwMTRjOTE0OWU0ZGRiYTQzZDYiCiAgICB9CiAgfQp9";
    }

}
