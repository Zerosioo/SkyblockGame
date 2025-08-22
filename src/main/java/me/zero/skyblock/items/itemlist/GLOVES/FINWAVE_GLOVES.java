package me.zero.skyblock.items.itemlist.GLOVES;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FINWAVE_GLOVES extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Finwave Gloves";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FINWAVE_GLOVES"; 
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
        return ItemType.GLOVES;
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MjU1OTQ4Mzg4MywKICAicHJvZmlsZUlkIiA6ICIxZjEyNTNhYTVkYTQ0ZjU5YWU1YWI1NmFhZjRlNTYxNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJOb3RNaUt5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzhkYmE1MDlmYmQ5MmNmNjBiZmJhODg0ZTYyOTY2NDlhOWVjMjkyZTQ1OGQ0YjUxNDYyNWU4NTEyZmNlNGI4MGMiCiAgICB9CiAgfQp9";
    }

}
