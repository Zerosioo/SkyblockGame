package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EMBER_FRAGMENT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Ember Fragment";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EMBER_FRAGMENT"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzgzNjkxNiwKICAicHJvZmlsZUlkIiA6ICJhZDEwM2FhODMzNWM0ZDA4YjNlZWI2ZDI2NjNkMzA0MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJJY2hpaW5uIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzI2YzUwZTg5NzZjOWY4OTA1NzU0ZGQ0NWYzMGQ0MTJiOGM1OWZlNTZkMzk3NTk5ZjdiYTc2MDVmMmJmNTUxOGYiCiAgICB9CiAgfQp9";
    }

}
