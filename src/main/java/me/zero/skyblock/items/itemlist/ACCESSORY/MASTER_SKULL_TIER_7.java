package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MASTER_SKULL_TIER_7 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Master Skull - Tier 7";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MASTER_SKULL_TIER_7"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTg2MzYyOTgxNSwKICAicHJvZmlsZUlkIiA6ICJiOTE5M2NiMjkzMWI0M2FhYmM1OGQ2NjAwMTg3NGRjMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJiMmJsYWtlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2EwNGU0N2M0MzU3NmY4ZDcyZWJhYmI0NTg3NjRhZmZiNTg4ZmMwMTgyNjI3MzJlODUxNDlkZjliYmFhYjc3NjciCiAgICB9CiAgfQp9";
    }

}
