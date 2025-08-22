package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BUILDER_BERRY_BUSH extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Berry Bush";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BUILDER_BERRY_BUSH"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNzE1OTM4MjI1NCwKICAicHJvZmlsZUlkIiA6ICJiMGQ3MzJmZTAwZjc0MDdlOWU3Zjc0NjMwMWNkOThjYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJPUHBscyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81NTNmODM4MWQ4OTBkNmRkNWIwMzhiYzdhM2VjOWQ4ZDA4ZTJkN2RhM2RlYjE3ZjA4MWI1ODAwZWVjNTA1ZGZiIgogICAgfQogIH0KfQ==";
    }

}
