package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REFINED_UMBER extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Refined Umber";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REFINED_UMBER"; 
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
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 256000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODkxOTg5MjQ3NywKICAicHJvZmlsZUlkIiA6ICI4ZDYwNGY0NWM0OWQ0YWE2Yjc0MjhiNTJlYzcyYjliNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTdGFyRG9ubiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83MDFkYjFmN2NkOWRiMTkyZGYyYzBkZjJmMDExNGY2YjkyNTg2NWQwYzM0N2YyNjVlNzk0NmU5ZDY3NjIyZWI3IgogICAgfQogIH0KfQ==";
    }

}
