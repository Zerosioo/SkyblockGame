package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SNOW_GENERATOR_2 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Snow Minion II";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SNOW_GENERATOR_2"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NzY1MTMyODgwNzEsInByb2ZpbGVJZCI6ImQzMDQwY2FhNmNiMTRkNzZhNzI4NmNkMWJlYmQxZWE5IiwicHJvZmlsZU5hbWUiOiJQdXJpayIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjk5MjFiYWI1NGFmMTQwNDgxYzAxNmE1OWE4MTliMzY5NjY3YTRlNGZiMmYyNDQ5Y2VlYmY3Yzg5N2VkNTg4ZSJ9fX0=";
    }

}
