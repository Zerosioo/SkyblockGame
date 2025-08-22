package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PERFECT_PLATE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Perfect Plate";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§oA plate forged","§ofrom an assortment","§oof the most","§odurable materials","§ofound in this","§oworld.")); 
    }

    @Override
    public String getId() {
        return "PERFECT_PLATE"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxMTA2ODIwMzc3NCwKICAicHJvZmlsZUlkIiA6ICI0OTY5YTVlZTYxMTY0MDBkYTM4YzhmZjRiMWJhZTZiZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZWFjdFpJUCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xNDdlZjg2NmFjMDIwNDU3ZjM4Zjg4Y2NiN2ZjNDJiMmMxMjhkMGE4NDQ2YzkzN2Q1NDUxMDQ2NmNkYTFkN2MwIgogICAgfQogIH0KfQ==";
    }

}
