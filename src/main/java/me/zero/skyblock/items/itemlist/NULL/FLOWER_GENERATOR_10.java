package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLOWER_GENERATOR_10 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Flower Minion X";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLOWER_GENERATOR_10"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5MzY0MTk5MjcsInByb2ZpbGVJZCI6IjkxZmUxOTY4N2M5MDQ2NTZhYTFmYzA1OTg2ZGQzZmU3IiwicHJvZmlsZU5hbWUiOiJoaGphYnJpcyIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDcxOWY2MDQxYWFhZjZjN2I1NTA0MmE1NTBkNTFlMTdhZjcyN2Y2YjhlNDFhZjA5YTFhZGVkNDljOWZmOWUzMSJ9fX0=";
    }

}
