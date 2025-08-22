package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RAZOR_SHARP_SHARK_TOOTH_NECKLACE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Razor-sharp Shark Tooth Necklace";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RAZOR_SHARP_SHARK_TOOTH_NECKLACE"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public int getStrength() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5ODI1Mjg5ODE0MCwKICAicHJvZmlsZUlkIiA6ICI1NjY3NWIyMjMyZjA0ZWUwODkxNzllOWM5MjA2Y2ZlOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVJbmRyYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83NzkyNjc2NjY0YWM3MTE0ODg2NDFmNzJiMjU5NjE4MzU2MTNkYTlmZmQ0M2VhM2JkZDE2M2NiMzY1MzQzYTYiCiAgICB9CiAgfQp9";
    }

}
