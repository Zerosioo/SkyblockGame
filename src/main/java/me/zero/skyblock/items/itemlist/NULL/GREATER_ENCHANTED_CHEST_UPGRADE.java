package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GREATER_ENCHANTED_CHEST_UPGRADE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Greater Storage Upgrade";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GREATER_ENCHANTED_CHEST_UPGRADE"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNDc0NzkzNDk4MSwKICAicHJvZmlsZUlkIiA6ICIwNjEzY2I1Y2QxYjg0M2JjYjI4OTk1NWU4N2QzMGEyYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJicmVhZGxvYWZzcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83Mjg0ZGMwOTg0ZjRmZTVkZDU0ZmNiYjM4YmRkZjZmMTg0OGYwZWY2MTIxNzY3NTRmOTc1YWJjOGM5N2UxMjQ5IgogICAgfQogIH0KfQ==";
    }

}
