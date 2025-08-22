package me.zero.skyblock.items.itemlist.PET_ITEM;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WASHED_UP_SOUVENIR extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Washed-up Souvenir";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WASHED_UP_SOUVENIR"; 
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
        return ItemType.PET_ITEM;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTQyMTg2Njk5MywKICAicHJvZmlsZUlkIiA6ICI3MzE4MWQxZDRjYWQ0ZmU0YTcxNWNjNmUxOGNjYzVkNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJaZmVybjRuZGl0byIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zNzc3ZjA0NjQ0ZGVjNWY4MGJmZWFhNzQwMWFjZmJiYzE1MGViMjVkM2ZmOGJlNDIyMGU3YzM0NDI2Y2Q3MjdjIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
