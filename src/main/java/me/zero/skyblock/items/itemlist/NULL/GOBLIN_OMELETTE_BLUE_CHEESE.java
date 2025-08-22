package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOBLIN_OMELETTE_BLUE_CHEESE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Blue Cheese Goblin Omelette";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oMay cause","§7§oillness")); 
    }

    @Override
    public String getId() {
        return "GOBLIN_OMELETTE_BLUE_CHEESE"; 
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
    public int getPrice() {
        return 20840;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyNDU0NjEzMTc5MCwKICAicHJvZmlsZUlkIiA6ICJmZDYwZjM2ZjU4NjE0ZjEyYjNjZDQ3YzJkODU1Mjk5YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZWFkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2I1YmNhYjU1ZDUzZTQyNTU2ZjVlODU4ODc0ZWM4Yjc2YThkYTAwODk4NTIyZTZjYmQ2NzNlM2ZiOTgzM2RlYWYiCiAgICB9CiAgfQp9";
    }

}
