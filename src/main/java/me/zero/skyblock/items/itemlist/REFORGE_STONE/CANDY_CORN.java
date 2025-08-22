package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CANDY_CORN extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Candy Corn";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CANDY_CORN"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 770;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMjcxMTM4MzY3NiwKICAicHJvZmlsZUlkIiA6ICIyM2YxYTU5ZjQ2OWI0M2RkYmRiNTM3YmZlYzEwNDcxZiIsCiAgInByb2ZpbGVOYW1lIiA6ICIyODA3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE3NmU0YWFjNjBlNTBiZTk0OTUxOTFlMDA5OGIyZGU1MmM0ZmUxMzdkMmY4ZmRlMTBhMjY3ZWVmNzEyM2EyZWUiCiAgICB9CiAgfQp9";
    }

}
