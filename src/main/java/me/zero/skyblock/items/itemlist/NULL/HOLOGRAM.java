package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HOLOGRAM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Hologram";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HOLOGRAM"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2ODE2OTIzOTcyNCwKICAicHJvZmlsZUlkIiA6ICIxMzdmMjg3MjUwOTE0ZmI4YjA0ZTYwYjg4MWUwZWE2YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJub3JtYWxpc2luZyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xOTg1MjhmZDdkZDA2NmUzMDY0MDNhNzVlNDA2ZDYyMDE0MGJlYzQ3YmI2Yzc3ZTcwZTljZDk4ZGVkOWM5ZGUxIgogICAgfQogIH0KfQ==";
    }

}
