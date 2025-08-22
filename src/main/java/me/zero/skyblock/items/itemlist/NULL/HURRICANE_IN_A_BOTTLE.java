package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HURRICANE_IN_A_BOTTLE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Hurricane in a Bottle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HURRICANE_IN_A_BOTTLE"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczMDY0NzM1NjM1NywKICAicHJvZmlsZUlkIiA6ICI5ZjJiY2M1M2U4YzM0OTY4YTc5Yzc0NTExYWQ2NmQyYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJLYWJveWlvIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU5ZDU4YjMxMTI2NTZiNTM5MDYzYWM3NWEzNmY2MzU5ZTI1NmYzZmNmNzU1ZjVkOGM4YzVhMDA0OTNmOTg2NTEiCiAgICB9CiAgfQp9";
    }

}
