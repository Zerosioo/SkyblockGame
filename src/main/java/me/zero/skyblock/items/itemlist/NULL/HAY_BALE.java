package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HAY_BALE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Hay Bale";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HAY_BALE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjY1MzEzMCwKICAicHJvZmlsZUlkIiA6ICI4ZTFjZTM2ZGE2Mzk0ZjgwOTFmZjZjYTZiZTNhZTA5NSIsCiAgInByb2ZpbGVOYW1lIiA6ICJGdWxsY3JlbiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iNWJjZTM3OWRkMzE0OWEzYTBjN2NjZDMxYzkwYzA4ZmMzYTdjYjVlNTBkNDQyZTlkYzJjMzJkMTU1YjE3ZGFjIgogICAgfQogIH0KfQ==";
    }

}
