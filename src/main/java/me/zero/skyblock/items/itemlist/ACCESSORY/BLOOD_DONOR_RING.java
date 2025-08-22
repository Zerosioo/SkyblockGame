package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLOOD_DONOR_RING extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Blood Donor Ring";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("There's like 5","liters in you.")); 
    }

    @Override
    public String getId() {
        return "BLOOD_DONOR_RING"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 2000;
    }

    @Override
    public int getHealthRegeneration() {
        return 2;
    }

    @Override
    public int getRiftManaRegeneration() {
        return 5;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjE2NDMxNSwKICAicHJvZmlsZUlkIiA6ICJiYWRkZjIxZTFmNWE0ZGYzOGVjZmNkOTYwY2E0YzA5YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJBbmRlckJUIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2UzZTk1YzgzZjU0ZTI2NjJmMGIwZGYyODdhZmI1YzQ4ZDljYWQyZWFjNDZjYjgwYzhjYjRjNGY0NjhlMTNjMzMiCiAgICB9CiAgfQp9";
    }

}
