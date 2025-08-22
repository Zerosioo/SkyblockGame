package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SHARP_SHARK_TOOTH_NECKLACE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Sharp Shark Tooth Necklace";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SHARP_SHARK_TOOTH_NECKLACE"; 
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
        return Rarity.EPIC;
    }

    @Override
    public int getStrength() {
        return 8;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5ODI1Mjg3MDIwNywKICAicHJvZmlsZUlkIiA6ICJkMGI4MjE1OThmMTE0NzI1ODBmNmNiZTliOGUxYmU3MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJqYmFydHl5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzIyOGUzZmI2YmQ5ODg3ZDYwNDM0Y2NkMjc5ZWMzZTU5MjI3ODI2YzlhMmY4ZGQ5Y2U5ODk5ZWE2NjgzZDRlZTgiCiAgICB9CiAgfQp9";
    }

}
