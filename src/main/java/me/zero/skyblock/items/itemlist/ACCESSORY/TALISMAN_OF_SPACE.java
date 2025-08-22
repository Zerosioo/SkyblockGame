package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TALISMAN_OF_SPACE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Talisman of Space";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TALISMAN_OF_SPACE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDQ4MTc2NDkzNywKICAicHJvZmlsZUlkIiA6ICIyYzEwNjRmY2Q5MTc0MjgyODRlM2JmN2ZhYTdlM2UxYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOYWVtZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82YzA5YmVhNGMxN2NkNTgxMmYzN2FhODYwOTY1MDk3NTYwODExYTBhNTkzZWE1NzMwMDUyNzRmYjY3OTUwNzNkIgogICAgfQogIH0KfQ==";
    }

}
