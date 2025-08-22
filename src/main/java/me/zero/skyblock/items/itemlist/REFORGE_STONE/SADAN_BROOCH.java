package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SADAN_BROOCH extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Sadan's Brooch";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SADAN_BROOCH"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMTQ4MDAxOTQ1MCwKICAicHJvZmlsZUlkIiA6ICJjZGM5MzQ0NDAzODM0ZDdkYmRmOWUyMmVjZmM5MzBiZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJSYXdMb2JzdGVycyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jYzhiNDdhMWE4ZjEwZDI5NTgzNjVlMTdhZjcyZWEyZTJlOTIyMGZlZmIzZDgwZDhmMzYxMTZhZjcxZWI0YWU3IgogICAgfQogIH0KfQ==";
    }

}
