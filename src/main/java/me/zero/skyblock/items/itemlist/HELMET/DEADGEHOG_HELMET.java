package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DEADGEHOG_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Deadgehog Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DEADGEHOG_HELMET"; 
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
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public int getIntelligence() {
        return 150;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NDE0OTgwNSwKICAicHJvZmlsZUlkIiA6ICJlNGUxYmY5NzMwZWI0NDRhYmIyOGIxODgxN2Q0M2YzZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNSU1PR0FNRVMwMzIxIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzVmNWM1ZTNjZjQ3OTEyYWJjNmJjMmM5N2Q3YjczNDcxNjZhZTRhZWFlYzk0ZTg3NWY1ODUwNDg2MGQ3OTNlOWYiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
