package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CLAY_GENERATOR_9 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Clay Minion IX";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CLAY_GENERATOR_9"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5MzQyNDY3MTQsInByb2ZpbGVJZCI6IjU2Njc1YjIyMzJmMDRlZTA4OTE3OWU5YzkyMDZjZmU4IiwicHJvZmlsZU5hbWUiOiJUaGVJbmRyYSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzdkZTExNDBhMmQxY2U1NThkZmZiMmY2OTY2NmRjOTE0NWFhODE2NmYxNTI4YTI1OTAxM2QyYWE0OWM5NDlhOCJ9fX0=";
    }

}
