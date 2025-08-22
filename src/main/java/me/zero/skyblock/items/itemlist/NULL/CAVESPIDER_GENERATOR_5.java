package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CAVESPIDER_GENERATOR_5 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Cave Spider Minion V";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CAVESPIDER_GENERATOR_5"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5MzM4NDY3OTUsInByb2ZpbGVJZCI6ImIwZDczMmZlMDBmNzQwN2U5ZTdmNzQ2MzAxY2Q5OGNhIiwicHJvZmlsZU5hbWUiOiJPUHBscyIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzY4MmM3NGJhNDRhNTIyMWE3MGY5ODE4OGU3NmE0ZTg4ZTQxZjYzMzM2M2E1NGFmMWQyNjI0NzQyMzEzMDYzNiJ9fX0=";
    }

}
