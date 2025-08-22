package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PEST_REPELLENT_MAX extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Pest Repellent MAX";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PEST_REPELLENT_MAX"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5OTYzMDQyMDg5NiwKICAicHJvZmlsZUlkIiA6ICI3NTA5NzZmODRmMDE0NWFhYTc0MzAwYWJhMzc5MTIzNCIsCiAgInByb2ZpbGVOYW1lIiA6ICIwY2hlYXRzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE2NDA0NWI0YmViYjZiNzI2YzYzMzE4NGU1OGYxYWE0NDMxZDk5YmM1YzhjYmU1MGQyNGEwMWFmNTMzODYxMzkiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
