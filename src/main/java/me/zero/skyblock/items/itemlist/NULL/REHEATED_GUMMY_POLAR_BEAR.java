package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REHEATED_GUMMY_POLAR_BEAR extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Re-heated Gummy Polar Bear";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REHEATED_GUMMY_POLAR_BEAR"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxNjA2NDQyNDQxMiwKICAicHJvZmlsZUlkIiA6ICI3NDhiMGEwNjFmNDI0ZDZmYjQ5ZjNhMWI3M2RjOWMyZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJ0aGVfbWFtYW1hIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQzMDY1ODdlYzM4YzI0NDZkMzg5YTU4MWUwNjkxNTU2ZmE1OGZjZTBhMDJkMDg0NmQyM2ZkNjhlMzY1NmEyNDkiCiAgICB9CiAgfQp9";
    }

}
