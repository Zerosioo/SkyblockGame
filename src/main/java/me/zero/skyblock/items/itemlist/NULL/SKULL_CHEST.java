package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SKULL_CHEST extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Skull Chest++";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SKULL_CHEST"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjMwMDMyMiwKICAicHJvZmlsZUlkIiA6ICI3NTA5NzZmODRmMDE0NWFhYTc0MzAwYWJhMzc5MTIzNCIsCiAgInByb2ZpbGVOYW1lIiA6ICIwY2hlYXRzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE4ODA3MjVhYzQwZDQ2NTQyYmY3YzgxOTgwMTg3MmUwZjAxYjdmOWE1MmE0YzQ4YTk4ZDdjOTQ4NzQ0ODRjMGYiCiAgICB9CiAgfQp9";
    }

}
