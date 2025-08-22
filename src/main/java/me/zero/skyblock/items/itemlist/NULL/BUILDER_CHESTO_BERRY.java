package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BUILDER_CHESTO_BERRY extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Chesto Berry";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BUILDER_CHESTO_BERRY"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjYxMzQ0NCwKICAicHJvZmlsZUlkIiA6ICIwMzY2OTMwNzgwY2U0NWMzYWM2OWRiOWZjODdmYzcxYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJpcm9uZGVzbyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jNzVjZDUyOGE1MWVhYTkwYmExMzNkOTgzMmRlMTM3Zjg4NzAxZjc0N2Q3N2Q5YTNjYzdhM2QxMmNlNGQ2ZGMwIgogICAgfQogIH0KfQ==";
    }

}
