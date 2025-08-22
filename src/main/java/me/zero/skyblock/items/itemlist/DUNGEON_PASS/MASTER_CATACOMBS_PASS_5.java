package me.zero.skyblock.items.itemlist.DUNGEON_PASS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MASTER_CATACOMBS_PASS_5 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Master Catacombs Pass V";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MASTER_CATACOMBS_PASS_5"; 
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
        return ItemType.DUNGEON_PASS;
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxNzExMDcxNzIxMywKICAicHJvZmlsZUlkIiA6ICI5MzZmMTA3MTEzOGM0YjMyYTg0OGY2NmE5Nzc2NDJhMiIsCiAgInByb2ZpbGVOYW1lIiA6ICIwMDAwMDAwMDAwMDAwMDB4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzMyMjkyZTRlMGZhNjI2NjcyNTZlZjhkYTBmMDE5ODJhOTk2NDk5ZjRkNWQ4OTRiZDA1OGMzZTZmM2QyZmIyZDkiCiAgICB9CiAgfQp9";
    }

}
