package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RED_SAND_GENERATOR_8 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Red Sand Minion VIII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RED_SAND_GENERATOR_8"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzODk2MzMzODA5NCwKICAicHJvZmlsZUlkIiA6ICJhOGJhMGY1YTFmNjQ0MTgzODZkZGI3OWExZmY5ZWRlYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJDcmVlcGVyOTA3NSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81NTM3ODAxYzEyMDcyMDYyNTc0NjYwOGUyZmNlYWYwNGFmMTZhZWFkMzQyOTZmN2M5Zjc5MGM1Njg3MmFiYmRhIgogICAgfQogIH0KfQ==";
    }

}
