package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAMP_LILAC extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Lilac Lamp";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LAMP_LILAC"; 
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
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzI5NzM4MSwKICAicHJvZmlsZUlkIiA6ICJhNWZlYWViNDdhYjA0ZDZiYTk2ZjMyOGJjMDQ3MDZjMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJYeW5kcmEyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2MwMTI3ZjNiN2U0NTNjYmViYjg2OWNjYmRiYjRhNjFkODFhMzMzMjBlMzliZjIyOTA2ZTEyMTZiZTFhMzk4NTQiCiAgICB9CiAgfQp9";
    }

}
