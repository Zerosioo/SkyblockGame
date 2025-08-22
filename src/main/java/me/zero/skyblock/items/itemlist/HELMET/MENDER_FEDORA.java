package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MENDER_FEDORA extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Mender Fedora";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MENDER_FEDORA"; 
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
        return Rarity.EPIC;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getGearScore() {
        return 30;
    }

    @Override
    public int getHealth() {
        return 220;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTg2Mjg3NDg0NiwKICAicHJvZmlsZUlkIiA6ICI1ZjU5NmViY2JlOTQ0NmQxYmI0M2JlNGYzZjRiOGJlNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUZWlsMHNzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzUyZDBlN2I2MGZhZGY5YjA4MDVhYTg2NmVkN2JkMjk4MGFiZWEwODEyZGIyYjcxNTA3NTJhNzFmYmYyZTIwZWYiCiAgICB9CiAgfQp9";
    }

}
