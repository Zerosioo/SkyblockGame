package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SNOW_BLASTER extends SItem implements ItemStatistics, SkullItem, Sellable, Museum {

    @Override
    public String getName() {
        return "Frosty the Snow Blaster";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SNOW_BLASTER"; 
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
        return Rarity.EPIC;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5Njc3Mzg0NjYzOSwKICAicHJvZmlsZUlkIiA6ICJhYTZhNDA5NjU4YTk0MDIwYmU3OGQwN2JkMzVlNTg5MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJiejE0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2UwN2FjM2NkMDU5MWVjMGEzNmY5MjcxYmFmNzQ2MTE2MjRkMzlhZjc1MzBiYjE5NTIyNTI5NTA3YTJlMjFiMjkiCiAgICB9CiAgfQp9";
    }

}
