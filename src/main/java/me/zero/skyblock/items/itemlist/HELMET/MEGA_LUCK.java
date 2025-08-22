package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MEGA_LUCK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Arenjey God";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MEGA_LUCK"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNOBTAINABLE;
    }

    @Override
    public int getMagicFind() {
        return 1000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3MTU0NzE1NDI4MSwKICAicHJvZmlsZUlkIiA6ICJkZjY2OWIyOGFmNWE0MTNjODFhNjcwOGQ0ZDIyM2FlNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJlbW9fbGFuZyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84ZGM1YmNkNjNlNGE5ODgwZmM4ZDc5ZWMwOWE2ODQwZDMyNzM2YzYwOWI4OWRmYjQyNzY1OTM4MWVmYzY3NTRkIgogICAgfQogIH0KfQ==";
    }

}
