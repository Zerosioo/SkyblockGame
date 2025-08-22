package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CORRUPTED_FRAGMENT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Corrupted Fragment";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oSpreads fast.")); 
    }

    @Override
    public String getId() {
        return "CORRUPTED_FRAGMENT"; 
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
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1ODMyMDc2MzE4MiwKICAicHJvZmlsZUlkIiA6ICJmMTYwZTMxMzJjYWM0YjRiOWM5OTk2NDQ1OGIxOWM0ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUb255S0tLIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2JiMzljMGU1M2U3OWU3ZWJkNGRiNmM2ZDA5NmM5ZDlhMTYwY2ZmMjc4MjJjMDc3ZmI4ZjVkNDU5NjljYzQ5NzIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
