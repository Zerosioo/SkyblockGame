package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EPOCH_CAKE_WHITE extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Cloudy Century Cake";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EPOCH_CAKE_WHITE"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0Nzk1NDY0ODIwMCwKICAicHJvZmlsZUlkIiA6ICI4Zjk3NzhmNWVhMTY0MDVmOWEwMDM0YjU4YjljMWM2MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJ1bm5hbWVkYXV0aG9yIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2JhMGE1YjUxMGE4ZDgyNGZmNDkxMGNhNWIyNjk4YWEzZDAzMGY4Mzc4MTBlOGQ3ZjBiYmNhOGNmMDZjZTIwMjMiCiAgICB9CiAgfQp9";
    }

}
