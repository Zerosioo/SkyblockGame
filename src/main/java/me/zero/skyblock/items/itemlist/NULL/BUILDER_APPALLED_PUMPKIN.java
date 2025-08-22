package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BUILDER_APPALLED_PUMPKIN extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Appalled Pumpkin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BUILDER_APPALLED_PUMPKIN"; 
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
    public int getPrice() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMzcyNzM5NTQzMSwKICAicHJvZmlsZUlkIiA6ICIyNzc1MmQ2ZTUyYmM0MzVjYmNhOWQ5NzY1MjQ2YWNhNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJkZW1pbWVkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzRmZjViYzJmNWM3NzljNmY2OTJjYTczZGEzNDNlYjBlZTJlYWM4MzI5NTk4M2E4MTBiMTc3YzhhZjJiOGNiZSIKICAgIH0KICB9Cn0=";
    }

}
