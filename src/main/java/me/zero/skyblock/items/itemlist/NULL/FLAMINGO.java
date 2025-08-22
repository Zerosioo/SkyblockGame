package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLAMINGO extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Flamingo Float";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLAMINGO"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MzA5Mjk4OTUyMiwKICAicHJvZmlsZUlkIiA6ICI5ZWEyMTQ0NGFiNjI0MWZkYjg5YjE2NDFhNDg2MGZiZiIsCiAgInByb2ZpbGVOYW1lIiA6ICI3QUJDSE9VTiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84ZDllNjM3ZThlNmZmM2YyZWRkZGZmNTk1NDAyZGUzMjRmY2Y0NTFhZDU1MGY2OTBhZDE4ZWRlMDUwZjJhNWYyIgogICAgfQogIH0KfQ==";
    }

}
