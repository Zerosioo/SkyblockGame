package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENDERMAN_GENERATOR_3 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Enderman Minion III";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENDERMAN_GENERATOR_3"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5MzU3MDU0MDksInByb2ZpbGVJZCI6ImIwZDRiMjhiYzFkNzQ4ODlhZjBlODY2MWNlZTk2YWFiIiwicHJvZmlsZU5hbWUiOiJ4RmFpaUxlUiIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmYyZTRkMDg1MGIwZDg3YzBiNmEyZDM2MWI2MzA5NjBmZjkxNjVhNDc4OTNjMjg3ZWRkZjNlZGEyY2FhMTAxYiJ9fX0=";
    }

}
