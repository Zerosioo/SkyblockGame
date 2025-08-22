package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STRONG_SHIMMER extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Shimmer Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STRONG_SHIMMER"; 
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
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.MYTHIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNTk5NTUwODY5OSwKICAicHJvZmlsZUlkIiA6ICIyYzEwNjRmY2Q5MTc0MjgyODRlM2JmN2ZhYTdlM2UxYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOYWVtZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hZDMyNDFmNDQxOWYwNmQxN2Q4OGIyMWNjOGU0MTJmNGVmMTFkN2NmYWRkODgyZTI2OWRhNWE0OTBlMDhmMGU0IgogICAgfQogIH0KfQ==";
    }

}
