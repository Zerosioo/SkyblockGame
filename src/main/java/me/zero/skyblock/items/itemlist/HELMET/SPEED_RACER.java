package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPEED_RACER extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "The Fast";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SPEED_RACER"; 
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
    public int getSpeed() {
        return 1000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5MDY5NzY2OTc4MywKICAicHJvZmlsZUlkIiA6ICJiMGQ3MzJmZTAwZjc0MDdlOWU3Zjc0NjMwMWNkOThjYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJPUHBscyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jN2Q2ZDRjOGI5YTIxM2U5NDMxYjMxNWRjNWJiODZiMmEyZDZlNGI5YzgwNjM4NWY2ZWY5YjczNjE5MTQ1NmMwIgogICAgfQogIH0KfQ==";
    }

}
