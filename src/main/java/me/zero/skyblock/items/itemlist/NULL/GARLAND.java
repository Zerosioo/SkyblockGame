package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GARLAND extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Garland";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GARLAND"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjgwNjg0MCwKICAicHJvZmlsZUlkIiA6ICI3NTA5NzZmODRmMDE0NWFhYTc0MzAwYWJhMzc5MTIzNCIsCiAgInByb2ZpbGVOYW1lIiA6ICIwY2hlYXRzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2I4MGM4NTJhMjYzZGM1OGI5NWZkMGE1NTNhZTNhMjAzZGQ1YjhkYjE2MTdhMzE2NTc2NjdhYzIzODY1NDcxNCIKICAgIH0KICB9Cn0=";
    }

}
