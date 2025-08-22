package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ROUGH_JASPER_GEM extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Rough Jasper Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ROUGH_JASPER_GEM"; 
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
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 3;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxODA4NjAxODU1MCwKICAicHJvZmlsZUlkIiA6ICIwNWQ0NTNiZWE0N2Y0MThiOWI2ZDUzODg0MWQxMDY2MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJFY2hvcnJhIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzIzZDA2NGVjMTUwMTcyZDA1ODQ0YzExYTE4NjE5YzE0MjFiYmZiMmRkZDFkYmI4N2NkYzEwZTIyMjUyYjc3M2IiCiAgICB9CiAgfQp9";
    }

}
