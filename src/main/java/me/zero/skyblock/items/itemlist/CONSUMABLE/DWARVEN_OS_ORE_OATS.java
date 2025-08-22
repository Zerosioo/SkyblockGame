package me.zero.skyblock.items.itemlist.CONSUMABLE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DWARVEN_OS_ORE_OATS extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Dwarven O's Ore Oats";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DWARVEN_OS_ORE_OATS"; 
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
        return ItemType.CONSUMABLE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNjQ5MTEyMjA0OSwKICAicHJvZmlsZUlkIiA6ICJiNzRlYjViMTc5OTc0YzZjODk3ZTgwNTM4Y2M1NmYwMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJQYW5kYUNoYW4yOCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mZGE3OTNiNDA5NTg5MmIwMWQ5NTRjYTEwZGIwZDZlMWQzNjZkNmI0ZTc2MTJkZWRjMjczZGZhNTc5ZWNiMjI3IgogICAgfQogIH0KfQ==";
    }

}
