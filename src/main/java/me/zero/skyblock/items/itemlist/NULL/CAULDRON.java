package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CAULDRON extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Cauldron";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CAULDRON"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjY1MzkxNSwKICAicHJvZmlsZUlkIiA6ICI0NmY3N2NjNmQ2MjU0NjEzYjc2NmYyZDRmMDM2MzZhNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaXNzV29sZiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82MDFkOTdmZjc3MzFiZGUwZTAyNTMyODZiOGMyOTM2ZmQ3ZTYzM2YxMzc5MzFhNGJmNDFlNTFlM2Y4YzdkODRlIgogICAgfQogIH0KfQ==";
    }

}
