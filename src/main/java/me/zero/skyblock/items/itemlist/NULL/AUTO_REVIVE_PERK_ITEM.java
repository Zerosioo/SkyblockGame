package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AUTO_REVIVE_PERK_ITEM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Purchase Revive";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "AUTO_REVIVE_PERK_ITEM"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTg1MDM4MjMzNCwKICAicHJvZmlsZUlkIiA6ICIxZDlkYmE3NzdlMWE0NzVkOTQ1ZDYxNmZlYzNiNjhlMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJGcmFzeWRpIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2I2YTc2Y2MyMmU3YzJhYjljNTQwZDEyNDRlYWRiYTU4MWY1ZGQ5ZTE4ZjlhZGFjZjA1MjgwYTViNDhiOGY2MTgiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
