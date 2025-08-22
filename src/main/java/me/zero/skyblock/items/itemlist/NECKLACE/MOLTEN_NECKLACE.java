package me.zero.skyblock.items.itemlist.NECKLACE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MOLTEN_NECKLACE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Molten Necklace";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MOLTEN_NECKLACE"; 
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
        return ItemType.NECKLACE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getPrice() {
        return 93750;
    }

    @Override
    public int getStrength() {
        return 20;
    }

    @Override
    public int getHealth() {
        return 30;
    }

    @Override
    public int getDefense() {
        return 20;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NzAxNjQxODA4MiwKICAicHJvZmlsZUlkIiA6ICI2NmI0ZDRlMTFlNmE0YjhjYTFkN2Q5YzliZTBhNjQ5OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJBcmFzdG9vWXNmIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzZiYzBjYTQ0YzY3OGM0ZmI0ZWJlNzNmMTI3MTdmOGFiNmRmM2I1YWI4NjhkMjE3ZTY4YzM2YWFmZTJhZDgwZTQiCiAgICB9CiAgfQp9";
    }

}
