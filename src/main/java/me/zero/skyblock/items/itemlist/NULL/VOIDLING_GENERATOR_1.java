package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VOIDLING_GENERATOR_1 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Voidling Minion I";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VOIDLING_GENERATOR_1"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTQ0OTYyMTExOCwKICAicHJvZmlsZUlkIiA6ICJlNGUxYmY5NzMwZWI0NDRhYmIyOGIxODgxN2Q0M2YzZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNSU1PR0FNRVMwMzIxIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzNhODUxZWQyY2U1YzJjMDUyM2FmNzcyZDIwNmQ5NTU1ZTJlMTM4M2VjODc5NDZlNmZmNGM1MTE4NmUyOWVmN2YiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
