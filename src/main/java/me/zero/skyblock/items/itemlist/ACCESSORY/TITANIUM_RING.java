package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TITANIUM_RING extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Titanium Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TITANIUM_RING"; 
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
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 2000;
    }

    @Override
    public int getMiningSpeed() {
        return 30;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDQ4MDg0MzQ0MiwKICAicHJvZmlsZUlkIiA6ICJmNjRmZWJkMTU4ZDg0ZTQzYTY5ZGU4OGNhYzZiY2FiZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJjaHJvb21hIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzJjM2VkZDkxOWMwY2M2ZDk2NjhmZmQyMTBlNDZkMmMwN2ZlMDg4YzQ0ZDg1ZjQ3ZDI1MWI0Zjg3NDgxMTc0ZjUiCiAgICB9CiAgfQp9";
    }

}
