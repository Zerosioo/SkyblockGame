package me.zero.skyblock.items.itemlist.CLOAK;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENIGMA_CLOAK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Enigma Cloak";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENIGMA_CLOAK"; 
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
        return ItemType.CLOAK;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4NDMzODg4MzYzMSwKICAicHJvZmlsZUlkIiA6ICIzYTE5NDgyNTYyZTc0MzFkYmNmOGUwOWE4N2VhMmQ5OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNckxpYW0yNjE0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzdjZDliOTNjODg4MmRjMmJlZmU5YzEzZDc2NTlhMzM4ZWI3NDU0YjhhMThlNzUzMTBkZjA1MTAxOTRlMmQ3YTEiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
