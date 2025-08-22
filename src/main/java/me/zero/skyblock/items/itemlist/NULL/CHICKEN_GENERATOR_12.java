package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHICKEN_GENERATOR_12 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Chicken Minion XII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CHICKEN_GENERATOR_12"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTQzMDA4MTM0OCwKICAicHJvZmlsZUlkIiA6ICI5ZDE1OGM1YjNiN2U0ZGNlOWU0OTA5MTdjNmJlYmM5MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTbm9uX1NTIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ZhMzlhYmU4ZDJjYjEwMjNhM2IxYmU1MjdkMmRhNTE1ODU3MzVkM2NlYTJiNzFkZmZhZmU1NTVhZjYzODdiNzkiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
