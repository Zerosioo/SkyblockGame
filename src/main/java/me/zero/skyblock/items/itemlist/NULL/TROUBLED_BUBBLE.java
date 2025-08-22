package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TROUBLED_BUBBLE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Troubled Bubble";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oSomething is","§8§otroubling this","§8§obubble, perhaps","§8§othe lingering","§8§othreat of the","§8§oWiki-Tiki.")); 
    }

    @Override
    public String getId() {
        return "TROUBLED_BUBBLE"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 1000000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTc0MDY3NTY1MTY4MCwKICAicHJvZmlsZUlkIiA6ICJmYjZkM2E5Zjk3MWY0ZTdlYmQ0MjE2Yjk0MjE5NDA3NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJtYXJjaXhkZCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iZGZjYzUzMGFkNGY2NDVhMjAxYWJjMDU5MTJmMTk0ODYyNjExYzMzNzM5YTA4MjZhOGJiOWFkMGQ5Yjk4Mzc1IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
