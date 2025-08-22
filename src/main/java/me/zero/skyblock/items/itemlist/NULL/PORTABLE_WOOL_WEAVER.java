package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PORTABLE_WOOL_WEAVER extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portable Wool Weaver";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PORTABLE_WOOL_WEAVER"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5NTI1NjExOTkzOSwKICAicHJvZmlsZUlkIiA6ICIwNjEzY2I1Y2QxYjg0M2JjYjI4OTk1NWU4N2QzMGEyYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJicmVhZGxvYWZzcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82NGU1ODdjMDhiMzQwM2Q3NjFjZGFmZTU0ZjRkNTMwY2JlMTRiNGM1YzJhMDFlODdlYTE4YWYxMWQwZTA0YzIwIgogICAgfQogIH0KfQ==";
    }

}
