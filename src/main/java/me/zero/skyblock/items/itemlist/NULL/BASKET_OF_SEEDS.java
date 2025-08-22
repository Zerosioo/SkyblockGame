package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BASKET_OF_SEEDS extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Basket of Seeds";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BASKET_OF_SEEDS"; 
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
        return Rarity.EPIC;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MjMyOTMxNjcwNTksInByb2ZpbGVJZCI6ImUzYjQ0NWM4NDdmNTQ4ZmI4YzhmYTNmMWY3ZWZiYThlIiwicHJvZmlsZU5hbWUiOiJNaW5pRGlnZ2VyVGVzdCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E2YmY5MTZlMjhjY2I4MGI0ZWJmYWNmOTg2ODZhZDZhZjdjNGZiMjU3ZTU3YThjYjc4YzcxZDE5ZGNjYjIifX19";
    }

}
