package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLORAL_LAMPPOST extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Floral Lamppost";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLORAL_LAMPPOST"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzNjg4MzQ1NzM2NSwKICAicHJvZmlsZUlkIiA6ICJjNTZlMjI0MmNiZWY0MWE2ODdlMzI2MGRjMGNmOTM2MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJMSlI3MzEwMCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80ODRhODY5YWUyN2MyZTJmMGIxZmI4MGE5MzRhMGMwZjQwNjM1Y2U3NWY2MzliOWEwMmU4Yzc0YzQxOGU3OWRlIgogICAgfQogIH0KfQ==";
    }

}
