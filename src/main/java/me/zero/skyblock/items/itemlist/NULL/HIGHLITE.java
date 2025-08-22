package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HIGHLITE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Highlite";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7This is what","§7happens when time","§7does a victory","§7lap.")); 
    }

    @Override
    public String getId() {
        return "HIGHLITE"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMzY2NjQ5MjQwMiwKICAicHJvZmlsZUlkIiA6ICIxNmQ4NjI4NzYzMWY0NDY2OGQ0NDM2ZTJlY2IwNTllNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZXphVG91cm5leSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jNmJjNjdlZjM2NjE4ZDIwOTliOWZmNGRmODQzNjYxYmFkMWI2NTQxZWYxY2I0NmIwMzEyNGI2NDlkMzg2YzQ0IgogICAgfQogIH0KfQ==";
    }

}
