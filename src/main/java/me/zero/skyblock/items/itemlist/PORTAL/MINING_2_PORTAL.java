package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MINING_2_PORTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portal to the Deep Caverns";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MINING_2_PORTAL"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxODk5OTIyNDk2OSwKICAicHJvZmlsZUlkIiA6ICI1NjY3NWIyMjMyZjA0ZWUwODkxNzllOWM5MjA2Y2ZlOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVJbmRyYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83NDIxM2RjNmRjNGIxNjQxZGVmZDMzM2Y0YTQ3MzJjYzcxNGRkNjc3NzE4ZmExMGYxNDBhNjkzOWMxMmFhMzJiIgogICAgfQogIH0KfQ==";
    }

}
