package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ANITA_TALISMAN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Anita's Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ANITA_TALISMAN"; 
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
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5NzU4NDE1NjMwMCwKICAicHJvZmlsZUlkIiA6ICJmMTYwZTMxMzJjYWM0YjRiOWM5OTk2NDQ1OGIxOWM0ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJGYWNrX1JvbiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iYjhlYzU3YjM3ZmRmMDkzZmU2NmVmZTJhYzA3MGE4ZjUxODE5NDk5NzBhNDQ1OGQ1NmVjOTcwMWVkZWQ4Y2ZmIgogICAgfQogIH0KfQ==";
    }

}
