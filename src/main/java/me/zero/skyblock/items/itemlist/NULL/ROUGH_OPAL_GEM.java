package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ROUGH_OPAL_GEM extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Rough Opal Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ROUGH_OPAL_GEM"; 
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
        return 3;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjAwNzk1MywKICAicHJvZmlsZUlkIiA6ICI2OGVmMmM5NTc5NjM0MjE4YjYwNTM5YWVlOTU3NWJiNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVNdWx0aUFjb3VudCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hMTRkM2M1N2Y4MDgyNGIzODM5YjhiMjIwZjIxNThiY2E1MDVkNDk3ZmQxYzllM2YyOWY0MjJiMWU2MjA2YTQ1IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
