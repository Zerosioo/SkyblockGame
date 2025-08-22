package me.zero.skyblock.items.itemlist.BELT;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FINWAVE_BELT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Finwave Belt";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FINWAVE_BELT"; 
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
        return ItemType.BELT;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public int getPrice() {
        return 9000;
    }

    @Override
    public int getHealthRegeneration() {
        return 1;
    }

    @Override
    public int getFishingSpeed() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MjQ4Nzc4MTYwNCwKICAicHJvZmlsZUlkIiA6ICJjOWRlZTM4MDUzYjg0YzI5YjZlZjA5YjJlMDM5OTc0ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTQVJfRGVjZW1iZXI1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzY1MWMwOTQ1ODg4OGRhN2I2ZjY2YzVjYjFiYTFhMjFhNTNhMjkwNGZjZjFkZmRkYTUxMDNlZGI3M2ZhZWEwODciCiAgICB9CiAgfQp9";
    }

}
