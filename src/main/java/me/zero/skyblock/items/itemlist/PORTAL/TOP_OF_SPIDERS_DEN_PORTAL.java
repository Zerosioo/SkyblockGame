package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TOP_OF_SPIDERS_DEN_PORTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portal to the Top of the Nest";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TOP_OF_SPIDERS_DEN_PORTAL"; 
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
        return ItemType.PORTAL;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMjgyMzg3NjUxMywKICAicHJvZmlsZUlkIiA6ICI3MzgyZGRmYmU0ODU0NTVjODI1ZjkwMGY4OGZkMzJmOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJJb3lhbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85ZDgzZDA0OTQ5MzlkYmE1ZjI3YTFkY2JhNzAzMWQ1ZmVmZjQ0ZDZlZmU4ZDg2MjNlMTIwNTI0NzBkMGE2Njc0IgogICAgfQogIH0KfQ==";
    }

}
