package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PARTY_HAT_CRAB extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Crab Hat of Celebration";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PARTY_HAT_CRAB"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzMjY5NDY2OTQ2MCwKICAicHJvZmlsZUlkIiA6ICJiNzVjZDRmMThkZjg0MmNlYjJhY2MxNTU5MTNiMjA0YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJLcmlzdGlqb25hczEzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzJkODdhNTlhYmRjMTJmZDlhNWVjODY1YmU2ZmM0ZDU3MWM4YzlhMjc4ZjQzNDIxNGE0NDJiMThlZDdiMDQ1N2MiCiAgICB9CiAgfQp9";
    }

}
