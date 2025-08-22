package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SUBZERO_INVERTER extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Subzero Inverter";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SUBZERO_INVERTER"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjAzNzMzMywKICAicHJvZmlsZUlkIiA6ICJmZGRmY2M4NjZmNWQ0N2JiOWE1ZmIwYmRiMzViYjQyYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJrYWRpcmNhbnBlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzk4ZjgwOTkwOWE0ZDRjZGU3ZjJhNzlkOTk4MjA1ZTQ4MTRiY2JiN2Q0YmM2MDJhMWQ1ODI2MjI0YWUwMjE3ODYiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
