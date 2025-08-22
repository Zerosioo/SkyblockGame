package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MITHRIL_FUEL_TANK extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Mithril-Infused Fuel Tank";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MITHRIL_FUEL_TANK"; 
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
    public int getPrice() {
        return 35300;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDYzNjYwMzY2NCwKICAicHJvZmlsZUlkIiA6ICJjNTBhZmE4YWJlYjk0ZTQ1OTRiZjFiNDI1YTk4MGYwMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUd29FQmFlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2VjYjMxNmY3YTIyN2E4YzU5ZDU4YWUwZGQ2NzY4ZmU0ZmE1NDZkNTViOWNmZGQ1NmNmZTQwYjY1ODZkODFjMjQiCiAgICB9CiAgfQp9";
    }

}
