package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EPOCH_CAKE_ORANGE extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Latest Update Century Cake";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EPOCH_CAKE_ORANGE"; 
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
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTQ1NzE2MTczOSwKICAicHJvZmlsZUlkIiA6ICI4MDBmNmU2ZGNiMTk0Yzc2OGE1OWU1Y2Q2MzFlNjI2YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ5dXl1dXUxIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Y1OGNkMjc1MDg4NDQ3MWMwODM2MzQzMzQzZWM2ZTE4ODIyOWRhMDU0ZWYzNjcxMDEzYWU4ZDQzZDZiMDI1NDgiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
