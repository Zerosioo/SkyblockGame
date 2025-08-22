package me.zero.skyblock.items.itemlist.NONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ATOMINIZER extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Atominizer";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ATOMINIZER"; 
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
        return ItemType.NONE;
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
        return 250000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0ODY2MzQ4ODY2MSwKICAicHJvZmlsZUlkIiA6ICI3NTA5NzZmODRmMDE0NWFhYTc0MzAwYWJhMzc5MTIzNCIsCiAgInByb2ZpbGVOYW1lIiA6ICIwY2hlYXRzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzMzNjM2NzU5N2I3N2RiNjlkM2YzZTIyNGY0OTdjN2Q3ZTA4ZjEyYzI5MGUwZGVkMTU0MjU2OTNmNDc3N2ZlYzgiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
