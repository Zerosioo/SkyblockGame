package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BUILDER_BLUE_CORN extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Blue Corn";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BUILDER_BLUE_CORN"; 
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
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0Mjc1NTEzNywKICAicHJvZmlsZUlkIiA6ICJhNzQ0NWIzOTdkMWY0ZjBiOTNkYTMwNGZjY2M2OTM1MiIsCiAgInByb2ZpbGVOYW1lIiA6ICJFc2tyYVRlVCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mZDU0MTU4MWIwZDI0YjFiNWFiMWRhZDRmNTFlMzgzZDAzYjliMGJjYjRjZjg2ZjEzNDUxNDU0NjhlZmQxYzVhIgogICAgfQogIH0KfQ==";
    }

}
