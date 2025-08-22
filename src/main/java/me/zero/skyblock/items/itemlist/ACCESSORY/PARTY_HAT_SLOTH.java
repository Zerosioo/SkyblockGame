package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PARTY_HAT_SLOTH extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Sloth Hat of Celebration";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PARTY_HAT_SLOTH"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4NTk3NzczODc5NywKICAicHJvZmlsZUlkIiA6ICIzNTE2NjhhMTk5MmM0ZGZlOWRkNmY5NTUxNWFkNzVmNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJCbHVlX1BrIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzcwYmZhZjVhYjNmODE3ZmJlZDcyNjNmYzFjMTUwYjU3MWYwMWIyZjdlZjE3YmM1Nzk2MTBhNDk1YmM0Y2ZlZTkiCiAgICB9CiAgfQp9";
    }

}
