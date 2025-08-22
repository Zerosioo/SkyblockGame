package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIREPLACE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Fireplace";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FIREPLACE"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjE4MzY0MywKICAicHJvZmlsZUlkIiA6ICIzYTdhMDVjMDc0MTI0N2Q2YWVmMDMzMDNkOWNlMjMzNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJzcXJ0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE2NDIyNjI0NWEyY2FiZDkxZmE1MTUzNWNjYTk4ZTkxNzk4N2U0NjQyYTZhZDk5NDMyMTdiMzMwZDdjOTFlNTEiCiAgICB9CiAgfQp9";
    }

}
