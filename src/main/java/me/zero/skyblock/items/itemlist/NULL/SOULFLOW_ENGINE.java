package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SOULFLOW_ENGINE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Soulflow Engine";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SOULFLOW_ENGINE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MTkzNzE5MiwKICAicHJvZmlsZUlkIiA6ICIwMzY2OTMwNzgwY2U0NWMzYWM2OWRiOWZjODdmYzcxYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJpcm9uZGVzbyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zYjA0MzNmMWMyMjc5NjA4ZjdiZDJjZWNlYjk4Y2QxNzVjYmFhZGMzZjYyOTlhZTNjY2FlMjU3ZGMyMmE1NWIyIgogICAgfQogIH0KfQ==";
    }

}
