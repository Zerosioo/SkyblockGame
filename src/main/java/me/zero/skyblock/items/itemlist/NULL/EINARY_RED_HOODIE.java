package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EINARY_RED_HOODIE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Einary's Red Hoodie";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EINARY_RED_HOODIE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwMDE3MTU3ODYwMiwKICAicHJvZmlsZUlkIiA6ICJiMTRiMjY2NzgxOTU0ZGM1OTUzYTRkYWQ5MjRiZGRjNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJHOWxfIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzk1MWYwNDA1Y2Q5NzY4NTMwZjkxMzg5OWE5NjIzYTlhMWU2YTRkMjc2YWE5NzUxNDAzNDc1NGRjZGRmNmM2MTkiCiAgICB9CiAgfQp9";
    }

}
