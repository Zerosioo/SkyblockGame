package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DEVOUR_RING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Devour Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DEVOUR_RING"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMjAzODgwOTE3MCwKICAicHJvZmlsZUlkIiA6ICI3MjI2Mjg2NzYyZWY0YjZlODRlMzc2Y2JkYWNhZjU1NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJicmFuZG9uZDI2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzhhN2QxYTUyZThjOGRkYWFmMGM0MjhlMWZlNDkwMWVmMzNlZmYyNTFmMjg5ZGUyNzE2Mzk1Y2FkMjBiZjMwOWIiCiAgICB9CiAgfQp9";
    }

}
