package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TUNGSTEN_KEYCHAIN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Tungsten Regulator";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TUNGSTEN_KEYCHAIN"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwOTA2MTIyNjgwNSwKICAicHJvZmlsZUlkIiA6ICI0MWZlYzZlMWQzNWM0ZDIyOWYxOGQ3OGRkZjk3ZGQzNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJSaWJva2luZ190dyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hMGNkYjY2YjUxNzliMmFmNjBiN2NmMDQ1Y2Q0MDNjOWEzMDRhNGIxOGFhMWE1ZWFhMmQ4YzQ3ODIxNDkyOTRmIgogICAgfQogIH0KfQ==";
    }

}
