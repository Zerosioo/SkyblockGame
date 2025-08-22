package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MYCELIUM_GENERATOR_1 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Mycelium Minion I";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MYCELIUM_GENERATOR_1"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzODk3MzE3NzY3MiwKICAicHJvZmlsZUlkIiA6ICI0ZjU2ZTg2ODk2OGU0ZWEwYmNjM2M2NzRlNzQ3ODdjOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ZjOGViYWQ3MmI3N2RmMzk5MGUwN2JjODY5YTk5YThmODk2MmQzYzE5Yzc2ZTM5ZDk5NTUzY2FlNDEzMWNjOCIKICAgIH0KICB9Cn0=";
    }

}
