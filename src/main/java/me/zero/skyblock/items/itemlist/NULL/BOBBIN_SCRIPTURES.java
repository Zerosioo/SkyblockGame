package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOBBIN_SCRIPTURES extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Bobbin' Scriptures";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("The sacred ways of","bobbin', written by","a long-forgotten","worshipper of","Kuudra.")); 
    }

    @Override
    public String getId() {
        return "BOBBIN_SCRIPTURES"; 
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
        return Rarity.RARE;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public int getPrice() {
        return 35000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzMzg5MTU1OTQ3NywKICAicHJvZmlsZUlkIiA6ICJmNWQwYjFhZTQxNmU0YTE5ODEyMTRmZGQzMWU3MzA1YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDYXRjaFRoZVdhdmUxMCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84ZDllOTU1YTUwNjAwMGYxZDhiZmM2OGVhYWZlMDRjYzdkZmI0NGYwNjIzYTFiM2QwYmYyMTVhOGQ1YTg2MWMyIgogICAgfQogIH0KfQ==";
    }

}
