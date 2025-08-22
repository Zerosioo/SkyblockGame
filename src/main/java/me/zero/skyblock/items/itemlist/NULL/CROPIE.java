package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CROPIE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Cropie";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CROPIE"; 
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
        return 25000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MjUwMjkyOTIyNCwKICAicHJvZmlsZUlkIiA6ICJjOWRlZTM4MDUzYjg0YzI5YjZlZjA5YjJlMDM5OTc0ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTQVJfRGVjZW1iZXI1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2RkMDFjYmEyM2VkZTJjZDI4OTUxMDdmMGMwMjU4ZTk3MWQyNDg1NTM4ZmU5NjQ5ZWYyODUzYmQyNmU2MjMyZGMiCiAgICB9CiAgfQp9";
    }

}
