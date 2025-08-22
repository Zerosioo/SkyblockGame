package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NETHER_WART_POUCH extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Nether Wart Pouch";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "NETHER_WART_POUCH"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzNTM1MjI3MDU0MCwKICAicHJvZmlsZUlkIiA6ICI2MTZiODhkNDMwNzM0ZTM3OWM3NDc1ODdlZTJkNzlmZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJKZWxseUZpbiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84NWUyNGI4YzJkMjBmOWUyM2JjYTUyZDk0ZmJkODIwYWEwNzQ0NTkxYWNiMDM1OTE4MzMxMmU0M2EyODdlNWIwIgogICAgfQogIH0KfQ==";
    }

}
