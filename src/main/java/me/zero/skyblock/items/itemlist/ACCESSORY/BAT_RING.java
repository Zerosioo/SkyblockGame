package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BAT_RING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Bat Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BAT_RING"; 
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
        return Rarity.EPIC;
    }

    @Override
    public int getHealth() {
        return 3;
    }

    @Override
    public int getIntelligence() {
        return 2;
    }

    @Override
    public int getSpeed() {
        return 2;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDAyMjMyOTU2MSwKICAicHJvZmlsZUlkIiA6ICJjYmYxNGIxMGJhNWU0NzgwYjIyNmFiNmQzOTUxODk4YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJFZ2d5QnV0dG9uMjQxMSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iYzc4MzE0MjU1ZDg4NjRhNzUzZmU5NTYyMjU2NDA0NmYwZGVlMmE4MmM2ZTRlMmU3ZjQ1MmZjYjk1YWYzMThjIgogICAgfQogIH0KfQ==";
    }

}
