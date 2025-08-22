package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WEBBED_FOSSIL extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Webbed Fossil";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("The webbed foot of a","small, agile","creature which was a","strong swimmer.")); 
    }

    @Override
    public String getId() {
        return "WEBBED_FOSSIL"; 
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
    public int getPrice() {
        return 50000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODY0MzUyNzczMywKICAicHJvZmlsZUlkIiA6ICJiOThjNGFkOGM2MjY0NGYxOWUzYzhhZTE0ZThhMDI1OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ5cnRlZGR5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2UyYzBmYTMwZDdmNGFjZDEyYTVmMDcwYTZmN2Y5NWE3N2Y4NjA2OGMyMjQ1ODc4Zjk5YTJmNmIzZjhmYmY2MyIKICAgIH0KICB9Cn0=";
    }

}
