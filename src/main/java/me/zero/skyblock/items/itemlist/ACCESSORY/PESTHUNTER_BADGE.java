package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PESTHUNTER_BADGE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Pesthunter Badge";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PESTHUNTER_BADGE"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5OTU4NzAzMjUyOSwKICAicHJvZmlsZUlkIiA6ICJhYmRiNTFhYjE0Njk0Y2ZkYWU5ZjliNzFiZWJmYWI2YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJZYW5ub3VfXyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iNGYxZjBjZjNhZGI0YWRjNmI5OTZmZjljYjRlNmQ5ZDg5MTJlMGE1YWI4NTFjMzY2YzhiZmJkYWY4YjJlZjA0IgogICAgfQogIH0KfQ==";
    }

}
