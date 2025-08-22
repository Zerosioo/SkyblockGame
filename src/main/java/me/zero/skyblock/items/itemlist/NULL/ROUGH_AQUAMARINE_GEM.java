package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ROUGH_AQUAMARINE_GEM extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Rough Aquamarine Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ROUGH_AQUAMARINE_GEM"; 
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
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 3;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwNzY0MDUyNDcwMiwKICAicHJvZmlsZUlkIiA6ICI5YzM1ZGU3MjdmMzU0ZTVlYjFiOWRhOGViYTZhYzM1YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJtb21teXR3ZXJrZXVzZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81YTU4YTM4Zjc3YjVmMGYzNjEwYjE2NGRhMjllOTAxNjYxYjQ2MjhhNDgyZDVmNzAyYjcxMDU0ZjY2NWUzNTJjIgogICAgfQogIH0KfQ==";
    }

}
