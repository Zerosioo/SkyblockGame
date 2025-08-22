package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REAPER_PEPPER extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Reaper Pepper";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REAPER_PEPPER"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MTk1ODk0OSwKICAicHJvZmlsZUlkIiA6ICIzMzE5Y2ZkMTdiMDU0MTEzOTdiYTI4ZjlhMmJjMTg1NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJQYW5zaG9GZWlrIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2I1ZDYxN2I0Y2U0NTcwNTI0MGJkNDhmNWJhNTBlMjVjYTgzNzUyOTBhMjEyYWNjNWYzMDM5YzJlZDgxNzg2MDYiCiAgICB9CiAgfQp9";
    }

}
