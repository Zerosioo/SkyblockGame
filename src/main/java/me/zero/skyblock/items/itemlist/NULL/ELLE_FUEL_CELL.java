package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ELLE_FUEL_CELL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "%%green%%Ballista Fuel Cell";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ELLE_FUEL_CELL"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDAyOTIzMDk5OSwKICAicHJvZmlsZUlkIiA6ICJkM2Y5MjEyMjY3YzM0YzEwYWNjOWZkNGI5MDFkYjI0ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJkYXl3ZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mZDcyZGViMWFiMDAzM2I0MmIwYTEyZWZjZjQ4M2YwZmJhMjZkYzUxZGVkMzkxOWViYWRiNzBmOTY1N2ExZjYxIgogICAgfQogIH0KfQ==";
    }

}
