package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAMP_BROWN extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Brown Lamp";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LAMP_BROWN"; 
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
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzMzM3NDM3Mjg0OSwKICAicHJvZmlsZUlkIiA6ICIxYWZhZjc2NWI1ZGY0NjA3YmY3ZjY1ZGYzYWIwODhhOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJMb3lfQmxvb2RBbmdlbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hODhhNzEzNzg4ODEzZjBjNTk4NmUyYmI2YTA5Y2EzYjk5MzY1MTM4MjAzMjM1ZTBmNzk2Y2I2NjAxZDc3NGY4IgogICAgfQogIH0KfQ==";
    }

}
