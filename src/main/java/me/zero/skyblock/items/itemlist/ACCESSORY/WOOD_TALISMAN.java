package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WOOD_TALISMAN extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Wood Affinity Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WOOD_TALISMAN"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 160;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMjAzNzY3NTE4NiwKICAicHJvZmlsZUlkIiA6ICI0OWIzODUyNDdhMWY0NTM3YjBmN2MwZTFmMTVjMTc2NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJiY2QyMDMzYzYzZWM0YmY4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzkwN2E5MTM0NzFhNWJiYmI0YzBhN2YyMzNkNzhjMjc2MjhjZjBlNTE2YTJmYjQ2MzYwY2QwZTM3MGM1MDgzNDUiCiAgICB9CiAgfQp9";
    }

}
