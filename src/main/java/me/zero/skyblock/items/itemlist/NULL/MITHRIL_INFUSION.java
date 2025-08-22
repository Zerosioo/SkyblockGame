package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MITHRIL_INFUSION extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Mithril Infusion";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MITHRIL_INFUSION"; 
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
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public int getPrice() {
        return 4346;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNzk2Njc3NzM2NSwKICAicHJvZmlsZUlkIiA6ICI2MWVhMDkyM2FhNDQ0OTEwYmNlZjViZmQ2ZDNjMGQ1NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVEYXJ0aEZhdGhlciIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83ZTA1MWRmNGRkMjE1MTQ4MWY1MTQ1YjkzZmI3YTlhYTYyODg4ZmJjYjkwYWRkOTg5MGFkMDdjYWYxZmFjYTczIgogICAgfQogIH0KfQ==";
    }

}
