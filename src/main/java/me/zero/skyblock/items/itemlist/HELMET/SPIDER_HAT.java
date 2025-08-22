package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPIDER_HAT extends SItem implements ItemStatistics, SkullItem, Sellable, Museum {

    @Override
    public String getName() {
        return "Spider Hat";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SPIDER_HAT"; 
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
        return Rarity.COMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.STARTER;
    }

    @Override
    public int getPrice() {
        return 12;
    }

    @Override
    public int getCritChance() {
        return 25;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMjgyMzg3NjUxMywKICAicHJvZmlsZUlkIiA6ICI3MzgyZGRmYmU0ODU0NTVjODI1ZjkwMGY4OGZkMzJmOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJJb3lhbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85ZDgzZDA0OTQ5MzlkYmE1ZjI3YTFkY2JhNzAzMWQ1ZmVmZjQ0ZDZlZmU4ZDg2MjNlMTIwNTI0NzBkMGE2Njc0IgogICAgfQogIH0KfQ==";
    }

}
