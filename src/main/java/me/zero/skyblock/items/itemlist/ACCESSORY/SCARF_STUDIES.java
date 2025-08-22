package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SCARF_STUDIES extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Scarf's Studies";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SCARF_STUDIES"; 
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
        return Rarity.RARE;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public int getRiftTime() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxOTAyMzI3MzU3MCwKICAicHJvZmlsZUlkIiA6ICI5MWYwNGZlOTBmMzY0M2I1OGYyMGUzMzc1Zjg2ZDM5ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTdG9ybVN0b3JteSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zMzQ1M2Q2YTVhYWNhNjdhZmZhMDFmNDMyYWZkOWM0Y2ZlZmY0NTgyZDcyNTFjY2EzM2M1MzRlNzgyYzAzYWIxIgogICAgfQogIH0KfQ==";
    }

}
