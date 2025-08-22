package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BEHEADED_HORROR extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Beheaded Horror";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BEHEADED_HORROR"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public int getPrice() {
        return 15000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMjIzNjA5NzQ0NCwKICAicHJvZmlsZUlkIiA6ICI5ZDIyZGRhOTVmZGI0MjFmOGZhNjAzNTI1YThkZmE4ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTYWZlRHJpZnQ0OCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kYmFkOTllZDNjODIwYjc5NzgxOTBhZDA4YTkzNGE2OGRmYTkwZDk5ODY4MjVkYTFjOTdmNmYyMWY0OWFkNjI2IgogICAgfQogIH0KfQ==";
    }

}
