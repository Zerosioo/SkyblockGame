package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SMALL_HUSBANDRY_SACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Small Husbandry Sack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SMALL_HUSBANDRY_SACK"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NTMxNTU2MiwKICAicHJvZmlsZUlkIiA6ICJhMWQzNzljMjhhODA0ZTMxYjY3YjcyMDcyNWE0ZjI3NSIsCiAgInByb2ZpbGVOYW1lIiA6ICJDeXNwZWN0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzg4ZTQ2NGMxOTg0YzAwZTEwYzJhYmZlZmZiYzlhNjU5MzVjNGFmZGE2NjI2MWI1M2Q2ZjM2NmVmMjA0MmU4MjAiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
