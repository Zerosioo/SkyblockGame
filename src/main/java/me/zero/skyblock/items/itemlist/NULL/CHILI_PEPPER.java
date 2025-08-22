package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHILI_PEPPER extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Chili Pepper";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("It's red hot, but","green!")); 
    }

    @Override
    public String getId() {
        return "CHILI_PEPPER"; 
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
    public int getPrice() {
        return 5000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3OTU2MTY4OTMyMSwKICAicHJvZmlsZUlkIiA6ICI3MWM1OTI5YmYzOTI0MGQwODBhYWM1OTNlODFkZTQ0ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJkb2NrbGFuZGJveTk5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Y4NTljOGRmMTEwOWMwOGE3NTYyNzVmMWQyODg3YzI3NDgwNDlmZTMzODc3NzY5YTdiNDE1ZDU2ZWRhNDY5ZDgiCiAgICB9CiAgfQp9";
    }

}
