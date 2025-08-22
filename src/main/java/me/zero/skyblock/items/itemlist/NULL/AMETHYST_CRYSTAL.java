package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AMETHYST_CRYSTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Amethyst Crystal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "AMETHYST_CRYSTAL"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMDA3NjM3ODkzNiwKICAicHJvZmlsZUlkIiA6ICJkMGI4MjE1OThmMTE0NzI1ODBmNmNiZTliOGUxYmU3MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJqYmFydHl5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2M0ZmM2MmNmNDc3N2FiZjM1NjVhNzA5ODUyNzc4ZTI0OGFhYWU5MzZmZDUxNTdjMzFkYjJhM2MyNDcwYTY2NWMiCiAgICB9CiAgfQp9";
    }

}
