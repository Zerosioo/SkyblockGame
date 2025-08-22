package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_COMPOST extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Compost Bundle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_COMPOST"; 
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
    public int getPrice() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2Mzc1Mzg4NTM4OSwKICAicHJvZmlsZUlkIiA6ICI2ZTIyNjYxZmNlMTI0MGE0YWE4OTA0NDA0NTFiYjBiNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJncnZleWFyZCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lM2M3NzA3YzJjNDE1MzY3MzdlM2RhNTA1OTFmZGU4YjczYTFiZjY2Njg0NTM2NzE1ZWY2NWI3YzBiYzg5OTdiIgogICAgfQogIH0KfQ==";
    }

}
