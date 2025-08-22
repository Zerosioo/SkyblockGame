package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ADVENT_CALENDAR_DISPLAY extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Advent Calendar Display";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ADVENT_CALENDAR_DISPLAY"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MTA0NTAwNCwKICAicHJvZmlsZUlkIiA6ICIzY2I3YTA3YWY3ZjM0ZWZiYTlkNGI4ODQ3NDM4Mzc0ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNckthaWxldCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zMTI1YTAwNjIxYjNlMmZlMjI4MmQxMjBkMDVjNWUwZjU4N2E1NDU2Zjg3Y2IzMmUzNTg0NDc2ZjUzNDkxNTE1IgogICAgfQogIH0KfQ==";
    }

}
