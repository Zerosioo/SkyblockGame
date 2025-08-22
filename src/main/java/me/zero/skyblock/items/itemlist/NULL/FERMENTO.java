package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FERMENTO extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Fermento";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FERMENTO"; 
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
        return 250000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MjUwMjkxNjU1MiwKICAicHJvZmlsZUlkIiA6ICIwOTZkYWUzZWY1MmU0YWU4ODk3ODY2N2EyOGIwZWFhNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJHd0FiaXlCZ2dnIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2NiNDFkYWViNTdkMmFlNjJjNjZlNThlYjZkZWJiMmE3ZDQ0NmUzNDU0MWE3NzEzNTA3MjhjOWRiMTViZWFmYmEiCiAgICB9CiAgfQp9";
    }

}
