package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PET_SKIN_HORSE_ZOMBIE extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "ZombieSkeleton Horse";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PET_SKIN_HORSE_ZOMBIE"; 
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
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNTQwMjg1NDk2NCwKICAicHJvZmlsZUlkIiA6ICJmMzA1ZjA5NDI0NTg0ZjU4YmEyYjY0ZjAyZDcyNDYyYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJqcm9ja2EzMyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81NzgyMTFlMWI0ZDk5ZDFjN2JmZGE0ODM4ZTQ4ZmM4ODRjM2VhZTM3NmY1OGQ5MzJiYzJmNzhiMGE5MTlmOGU3IgogICAgfQogIH0KfQ==";
    }

}
