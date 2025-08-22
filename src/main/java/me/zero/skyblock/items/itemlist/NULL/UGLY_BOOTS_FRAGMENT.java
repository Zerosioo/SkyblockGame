package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UGLY_BOOTS_FRAGMENT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Ugly Boots Fragment";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oUse these in","§7§oyour armor to","§7§otruly embrace","§7§othe art of not","§7§ocaring.")); 
    }

    @Override
    public String getId() {
        return "UGLY_BOOTS_FRAGMENT"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyNTk5MzE0MDU4MiwKICAicHJvZmlsZUlkIiA6ICJmNzM0MmExODMxZDA0ZDA5ODc4Y2ViOTVmOTUxYTllMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOb3RNMWtzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2EzZmVjZWFkOTdlOTZjMWM5NzdkNzI3YjZiODI5ZDRlNjM2NGI1YjgyZWU0ZTQ5YjA4NzUxMTY1NzI0ZWNkYyIKICAgIH0KICB9Cn0=";
    }

}
