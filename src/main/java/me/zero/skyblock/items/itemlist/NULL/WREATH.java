package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WREATH extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Wreath";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WREATH"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDg4NDM1NDU4MywKICAicHJvZmlsZUlkIiA6ICJkYmNlZjMyZjI5ZDc0Y2UzOTUzOWMwYjBhMTE1YjZiZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJyYW1waXJlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzI5ODQ1NTliZmJjNDAxNDBhOWZiNDc0Zjc4N2YzYjY4NmNjYTM4MDJjYjhkMjAzNjA4OWRkODlhNmVlNTA1OGQiCiAgICB9CiAgfQp9";
    }

}
