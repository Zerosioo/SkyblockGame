package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPECTRE_DUST extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Spectre Dust";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oA famous Wizard","§7§oused a wand made","§7§oout of these.")); 
    }

    @Override
    public String getId() {
        return "SPECTRE_DUST"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MjQ0MTQ1MzU0MSwKICAicHJvZmlsZUlkIiA6ICJhYTZhNzUwNWVkYmU0NjNiYjk1NWYyMWY0MjNiYTM1NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJub3RhbmR5d2FyaG9sIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Y3YzNmOTJiZjliZTczYWRkM2Y5ZTNkZDNkYWNjNTczODM1ZjQ4MmJmZTExZDMxYzFmY2Y5OTFkMDk2ZGVlYzciLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
