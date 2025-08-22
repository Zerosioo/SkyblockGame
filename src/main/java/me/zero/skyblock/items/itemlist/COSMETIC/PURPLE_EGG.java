package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PURPLE_EGG extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Purple Egged Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PURPLE_EGG"; 
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
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxNzQwODAzNDc5MSwKICAicHJvZmlsZUlkIiA6ICJiMGQ3MzJmZTAwZjc0MDdlOWU3Zjc0NjMwMWNkOThjYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJPUHBscyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yODYwMjM1MDhmNmZhNGZlYjhiZTRiYjgxNTNmNGEyNmZlMjZlZGQ2ZjEzMDdjNmY4MDQ0Y2QyYzY1M2EwOGJlIgogICAgfQogIH0KfQ==";
    }

}
