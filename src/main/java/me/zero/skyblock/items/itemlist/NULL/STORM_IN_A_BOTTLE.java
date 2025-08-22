package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STORM_IN_A_BOTTLE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Storm in a Bottle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STORM_IN_A_BOTTLE"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczMDY0NzM3MDk0NCwKICAicHJvZmlsZUlkIiA6ICJhZDEwM2FhODMzNWM0ZDA4YjNlZWI2ZDI2NjNkMzA0MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJJY2hpaW5uIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2NjNmVhOGRhMmNlM2RhMzJiMzE0MGIwNzI4YmUwOWMwNmY2YzM3ZTBjMmVkOTIzZTA2YzAzMmM4NTMyMDhhNCIKICAgIH0KICB9Cn0";
    }

}
