package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GINGERBREAD_HOUSE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Gingerbread House";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GINGERBREAD_HOUSE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzNjE4MzA2MDYwMCwKICAicHJvZmlsZUlkIiA6ICIwM2E5NjQ5NDA0NzI0MmE2YTQxYjljNGJhM2QwY2E5OCIsCiAgInByb2ZpbGVOYW1lIiA6ICJlcmljZXBwcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lMzBjYmZlZjIwNTQ5NjM4YzhhYjAwNWE3YzlkOTIyYjVhNWI0ODFlY2RiYzQxMDYwYjg0YTk4ZmZhZDA1YWM5IgogICAgfQogIH0KfQ==";
    }

}
