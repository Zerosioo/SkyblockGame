package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TUSK_FOSSIL extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Tusk Fossil";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("A great and powerful","tusk belonging to a","now-extinct","creature.")); 
    }

    @Override
    public String getId() {
        return "TUSK_FOSSIL"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 50000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODY0MzQxMDQyNCwKICAicHJvZmlsZUlkIiA6ICJiNzQ4YWExODk3ZGU0Y2RiYjFhNTI1YjVjMjM3ZDc2MiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaXhpOCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jNTFiOGQ1NGQ5NDQ0MDY3ZjczYWE2YWJmNmZjZTk3ZTkyY2MyOWVmZjRhNjdlY2Q1MTY4YWQxN2JlMjQwNzY0IgogICAgfQogIH0KfQ==";
    }

}
