package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WISHING_WELL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Wishing Well";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WISHING_WELL"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MjM1MTQ3NTQxMCwKICAicHJvZmlsZUlkIiA6ICI4YjgyM2E1YmU0Njk0YjhiOTE0NmE5MWRhMjk4ZTViNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTZXBoaXRpcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83MTA5ODZhZGRiYTljNjE3MjIyNGI1YzEwM2U3NmJmMzIxZTE5MWVkNjczMzZmZTY3OTY4ZDRiNDMzMTVhZTc2IgogICAgfQogIH0KfQ==";
    }

}
