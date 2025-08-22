package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VOIDLING_GENERATOR_7 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Voidling Minion VII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VOIDLING_GENERATOR_7"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMTk0MDcyNjU3MSwKICAicHJvZmlsZUlkIiA6ICI2MWVhMDkyM2FhNDQ0OTEwYmNlZjViZmQ2ZDNjMGQ1NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVEYXJ0aEZhdGhlciIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82ZWQwYWQwMTMwZTk5YTM2Y2Y3ZDc4Y2FlNzU5OTY1NDc2Zjk4MDI1YjE4MzNjZGU1NTQyZjdkYzQyODI5NDAwIgogICAgfQogIH0KfQ==";
    }

}
