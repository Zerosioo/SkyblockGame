package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DUNGEON_GREEN_SUPPORT_ORB extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Support Orb";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DUNGEON_GREEN_SUPPORT_ORB"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNTM1NjUyNzQzOSwKICAicHJvZmlsZUlkIiA6ICJhYTZhNDA5NjU4YTk0MDIwYmU3OGQwN2JkMzVlNTg5MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJiejE0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE1NzhiNGFmM2ZkZDkxNTFiODUwYjEzYzY3YzQ1ODAyMjRjN2Y2MDA1MjcxM2YyZDE1MWY3YzE1ZGMwZDdiMzQiCiAgICB9CiAgfQp9";
    }

}
