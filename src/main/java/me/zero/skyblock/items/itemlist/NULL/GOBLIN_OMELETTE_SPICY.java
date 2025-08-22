package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOBLIN_OMELETTE_SPICY extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Spicy Goblin Omelette";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oMay cause","§7§oinfections")); 
    }

    @Override
    public String getId() {
        return "GOBLIN_OMELETTE_SPICY"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyNDU0NjEwODc2NSwKICAicHJvZmlsZUlkIiA6ICI0ZjU2ZTg2ODk2OGU0ZWEwYmNjM2M2NzRlNzQ3ODdjOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2JjOTRjNmVkYmQ5YzkxYTQ1MTA1YjdlMWZlOWViNThmMWJlZWM1NDliNzM4NTAxZDc4NDFmZTczZTA0NzQ3YjkiCiAgICB9CiAgfQp9";
    }

}
