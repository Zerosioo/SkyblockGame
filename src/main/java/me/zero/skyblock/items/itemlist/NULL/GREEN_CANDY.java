package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GREEN_CANDY extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Green Candy";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GREEN_CANDY"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzA4ODM1NSwKICAicHJvZmlsZUlkIiA6ICIyMWNjMzkxZmNkMjc0NzY5OTg5Y2M3M2VjYWRiNTE3YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJHT1NUTFk5NyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lMzFjMGJkNzZhNjU1ZDVkOGZlYTViMDZkYWFmMWZiOGQ4MDYwYmYwODIzZWJiYzZlYjZmOTljOGVlNWEzNWFhIgogICAgfQogIH0KfQ==";
    }

}
