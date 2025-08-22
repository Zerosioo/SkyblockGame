package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RING_POTION_AFFINITY extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Potion Affinity Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RING_POTION_AFFINITY"; 
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
        return 2100;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1MjMzNTcxNTIzMCwKICAicHJvZmlsZUlkIiA6ICIwNTVhOTk2NTk2M2E0YjRmOGMwMjRmMTJmNDFkMmNmMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVWb3hlbGxlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ2YjVjZmRkODA0ZDc2MjQ5ZTdjNjk0NmIxZDlhZmEyMmU5YmRjNzIxNDlmNjgyZTcxNjU0YWVlODg1ZGZmYmIiCiAgICB9CiAgfQp9";
    }

}
