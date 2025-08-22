package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OBSIDIAN_TABLET extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Obsidian Tablet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "OBSIDIAN_TABLET"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1MDAyODM0NjAyNywKICAicHJvZmlsZUlkIiA6ICI4YjgyM2E1YmU0Njk0YjhiOTE0NmE5MWRhMjk4ZTViNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTZXBoaXRpcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xYTE1OWQ5YWMyZmRiMTY0ODU4YjYzNTBlMDNjMTkyNGYxN2U1YWE4NjExYTM0N2Q1NWI2Yjg5ODIwZmFmMDk0IgogICAgfQogIH0KfQ==";
    }

}
