package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TREASURITE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Treasurite";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oOrigin unknown.")); 
    }

    @Override
    public String getId() {
        return "TREASURITE"; 
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
    public int getPrice() {
        return 5000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDYzMjE4NzY2MCwKICAicHJvZmlsZUlkIiA6ICJiNWRkZTVmODJlYjM0OTkzYmMwN2Q0MGFiNWY2ODYyMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJsdXhlbWFuIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2JlMjYxYzZiODUyZGQzOGUwZDUxMzQ5YjFiODEzMjg4N2NkMWI2OWRhMDRkOGRhZjAxMjFhZjc5YWQ4ZGQ5MiIKICAgIH0KICB9Cn0=";
    }

}
