package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AURORA_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Aurora Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "AURORA_HELMET"; 
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
    public Gamestage getGamestage() {
        return Gamestage.PROFESSIONAL;
    }

    @Override
    public int getHealth() {
        return 160;
    }

    @Override
    public int getDefense() {
        return 50;
    }

    @Override
    public int getIntelligence() {
        return 190;
    }

    @Override
    public double getAbilityDamage() {
        return 16.0;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwMzc3ODA5MSwKICAicHJvZmlsZUlkIiA6ICJjNjc3MGJjZWMzZjE0ODA3ODc4MTU0NWRhMGFmMDI1NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzc2M2QyZmU5Mzg4MWI0ZjI2Y2JlMWRkM2IwOWRhN2NjNDhkYmNkYzU2OGQxOTg1MmFkNjM1ZDVkMTY4NTk2MTEiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
