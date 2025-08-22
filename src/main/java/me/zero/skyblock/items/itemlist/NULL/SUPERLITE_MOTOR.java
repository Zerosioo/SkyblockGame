package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SUPERLITE_MOTOR extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Superlite Motor";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SUPERLITE_MOTOR"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyNDU0NjIzNzk4NiwKICAicHJvZmlsZUlkIiA6ICIyNDBiYThlMzNlN2M0YzE0ODhiNzJmYmU1Njg2ZjhlNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJQbGF4Q3JhZnRzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzViYjQ4YmNjODE5Mjc3NDM4YTk4NmY1NTgxM2IwNWZlOTEwZjlkZTIyNmI5Y2QyNTc2ODI2NzRhOGFhZGM0M2EiCiAgICB9CiAgfQp9";
    }

}
