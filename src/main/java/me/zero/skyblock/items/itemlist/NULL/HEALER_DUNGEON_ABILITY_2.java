package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HEALER_DUNGEON_ABILITY_2 extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Healing Potion";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HEALER_DUNGEON_ABILITY_2"; 
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
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMzc5Mjk3MjA4NywKICAicHJvZmlsZUlkIiA6ICI3MjI2Mjg2NzYyZWY0YjZlODRlMzc2Y2JkYWNhZjU1NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJicmFuZG9uZDI2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE3ZTNkYjY0MDE0YTQ3ODg2NzBlNDljYTdiZTNkYTQxZmYzZmJiYWYxYzUzOTU4NGM2MzUzNTlhNWNiNjBhYWIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
