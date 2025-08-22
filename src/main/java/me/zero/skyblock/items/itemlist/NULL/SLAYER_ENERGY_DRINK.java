package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SLAYER_ENERGY_DRINK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Slayer© Energy Drink";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SLAYER_ENERGY_DRINK"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMDA1MDc1Njg3MSwKICAicHJvZmlsZUlkIiA6ICJjOTAzOGQzZjRiMTg0M2JiYjUwNTU5ZGE3MWFjMTk2MiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUQk5SY29vbGNhdCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kODlkZGNlMTMxMjAxMjY3YjAyNzQ1Mjc2NmJmYjI3ZDIxZDY4MzI4ZDZjMGIyM2FiNDk1MTg4NGY2YTVmZmJlIgogICAgfQogIH0KfQ==";
    }

}
